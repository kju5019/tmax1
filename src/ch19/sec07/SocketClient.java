package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	//�ʵ�
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIP;
	String chatName;
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
		this.chatServer = chatServer;
		this.socket = socket;
		this.dis = new DataInputStream(socket.getInputStream());
		this.dos = new DataOutputStream(socket.getOutputStream());
		InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
		this.clientIP = isa.getHostName();
		receive();
	}catch(IOException e) {
	
	}
}
	
	//JSON���� �ޱ�
	public void receive() {
		chatServer.threadPool.execute(()-> {
				try {
					while(true) {
						String receiveJson = dis.readUTF();
						JSONObject jsonObject = new JSONObject(receiveJson);
						String command = jsonObject.getString("command");
				switch(command) {
				case "incomming":
					this.chatName = jsonObject.getString("data");
					chatServer.sendToAll(this,"�����̽��ϴ�.");
					chatServer.addSocketClient(this);
					break;
				case "message":
					String message = jsonObject.getString("data");
					chatServer.sendToAll(this,message);
					break;
				}
					}
				}catch(Exception e) {
					chatServer.sendToAll(this,"�������ϴ�.");
					chatServer.removeSocketClient(this);
				}									
		});
	}//receive()
	
	
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		}catch(Exception e) {}
	}
	
	
	public void close() {
		try {
			socket.close();
		}catch(Exception e) {}
	}
	
					
}

