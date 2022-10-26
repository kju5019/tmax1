package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	
	public void connect() throws IOException{
		socket = new Socket("192.168.200.125",50001); //ä�ü����� �ּҿ� ��Ʈ��ȣ
		dis = new DataInputStream(socket.getInputStream()); //��Ʈ����ü ���
		dos = new DataOutputStream(socket.getOutputStream()); //��Ʈ����ü ���
		System.out.println("[Ŭ���̾�Ʈ] ������ �����");
		}

	//JOSN �ޱ�
	public void receive() {
		Thread thread = new Thread(()-> {
			try {
				while(true) {
					String json = dis.readUTF();
				JSONObject root = new JSONObject(json);
				String clientIP = root.getString("ClientOP");
				String chatName = root.getString("chatName");
				String message = root.getString("message");
				System.out.println("<"+chatName+"@"+clientIP+">");
				}
			}catch(Exception e) {
				System.out.println("[Ŭ���̾�Ʈ] ���� ���� ����");
				System.exit(0);
			}			
		});
		thread.start();
	} //receive()
	
	
	//JSON ������
	public void send(String json) throws IOException{
		dos.writeUTF(json);
		dos.flush();		
	}
	
	public void unconnect() throws IOException{
		socket.close();
	}
	
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect(); //��������
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ȭ�� �Է�: ");
			chatClient.chatName = scanner.nextLine();
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incomming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("---------------------------------");
			System.out.println("���� �޼����� �Է��ϰ� Enter");
			System.out.println("ä���� �����Ϸ��� q�� �Է��ϰ� Enter");
			System.out.println("---------------------------------");
			while(true) {
				String message = scanner.nextLine();
				if(message.equalsIgnoreCase("q")) {
					break;
				}else {
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("dara", message);
					json = jsonObject.toString();
					chatClient.send(json);
				}
			}
			scanner.close(); //��ĳ�� ����
			chatClient.unconnect();
			
		}catch(Exception e) {
			System.out.println("[Ŭ���̾�Ʈ] ���� ���� �ȵ�");
		}
	}
	
	
	
	
	
	
	
	
	
}
