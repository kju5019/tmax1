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
		socket = new Socket("192.168.200.125",50001); //채팅서버의 주소와 포트번호
		dis = new DataInputStream(socket.getInputStream()); //스트림객체 얻기
		dos = new DataOutputStream(socket.getOutputStream()); //스트림객체 얻기
		System.out.println("[클라이언트] 서버에 연결됨");
		}

	//JOSN 받기
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
				System.out.println("[클라이언트] 서버 연결 끊김");
				System.exit(0);
			}			
		});
		thread.start();
	} //receive()
	
	
	//JSON 보내기
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
			chatClient.connect(); //서버연결
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("대화명 입력: ");
			chatClient.chatName = scanner.nextLine();
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incomming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("---------------------------------");
			System.out.println("보낼 메세지를 입력하고 Enter");
			System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
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
			scanner.close(); //스캐너 종료
			chatClient.unconnect();
			
		}catch(Exception e) {
			System.out.println("[클라이언트] 서버 연결 안됨");
		}
	}
	
	
	
	
	
	
	
	
	
}
