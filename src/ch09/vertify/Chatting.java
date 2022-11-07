package ch09.vertify;

public class Chatting {
	 class Chat{
		 void start() {}
		 void sendMessage(String message) {}
	 }
	 //���ú����μ��� ����Ŭ���� Chat
	 void startChat(String chatId) {
	   String nickName = chatId;
	  //nickName = chatId;
	  //���� Ŭ����
	  Chat chat = new Chat() {
		  void start() {
			  while(true) {
				  String InputData = "�ȳ��ϼ���";
				  String message = "["+nickName+"]"+InputData;
				  sendMessage(message);
			  }
			  
		  }
	  };
	  chat.start();
	 }
	}


	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"] "+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

}
