package second.assignment.chatroom;

import java.util.ArrayList;
import java.util.List;


public class ChatRoom implements MessageMediator{
	
	List<User> users;
	Bot addBot;

	public ChatRoom() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		
		for(User chatroomUser: users) {
			
			//Skip the one who sends the message
			if(chatroomUser!= user) {
				chatroomUser.receiveMessage(message);
			}
	
		}
		
		if(message.contains("addBot")) {
			addBot = Bot.getBotInstance();
			addBot.getUsersInfo(users);
			addBot.addBotMessage(user);
			
		}
		
		if(addBot != null) {
			addBot.checkUserMessage(user, message);
		}

	}
	
	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}
}
