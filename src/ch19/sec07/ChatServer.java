package ch19.sec07;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	//�ʵ�
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());
	
	//�޼ҵ� ��������
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001);
		System.out.println("[����] ���۵�");
		
		Thread thread = new Thread (() -> {
				try {
					while(true) {
						Socket socket = serverSocket.accept();
						SocketClient sc = new SocketClient(this,socket);
					}
				}catch(IOException e) {}
				
		});
		thread.start();
	}//start()
	
	
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName+"@"+socketClient.clientIP;
		chatRoom.remove(key);
		System.out.println("����: "+key);
		System.out.println("���� ä���� ��: "+chatRoom.size()+"\n");
	}
	
	
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName+"@"+socketClient.clientIP;
		chatRoom.put(key,socketClient);
		System.out.println("����: "+key);
		System.out.println("���� ä���� ��: "+chatRoom.size()+"\n");
	}
	
	//Map�� ��ϵ� ��� Ŭ���̾�Ʈ���� �޼��� ����
	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clinetIP", sender.clientIP);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for(SocketClient sc: socketClients) {
			if(sc==sender) continue; //�����ڴ� ����
			sc.send(json); //������ �����鿡�� ����
		}		
	}//sendToAll()
	
	//��������
	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			chatRoom.values().stream().forEach(sc ->sc.close());
			System.out.println("[����] �����");
		}catch(IOException e) {}
	}
	
	public static void main(String[] args) {
		try {
			ChatServer chatServer = new ChatServer();  //ä�ü�����ü ����
			chatServer.start();  //ä�ü��� ����
			
			System.out.println("---------------------------------");
			System.out.println("ä���� �����Ϸ��� q�� �Է��ϰ� Enter");
			System.out.println("---------------------------------");
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String key = scanner.nextLine();
				if(key.equalsIgnoreCase("q")) break;
			}
			
		}catch (Exception e) {
				System.out.println("[����] "+e.getMessage());
			}
		}
}
	
		

