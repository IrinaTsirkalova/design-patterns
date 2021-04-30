package second.assignment.chatroom;

public class ChatRoomMain {
	
	public static void main(String[] args) {
	MessageMediator chat = new ChatRoom();
	
	User user1 = new ChatRoomUser(chat, "Ivan");
	User user2 = new ChatRoomUser(chat, "Zoya");
	User user3 = new ChatRoomUser(chat,"Nikolai");
	
	user3.sendMessage("Hi, friends addBot");
	
	user1.sendMessage("There is a Cat");
	user2.sendMessage("Ivan!!! Noooo...");
	}
	
}
