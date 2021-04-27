package second.assignment.chatroom;

import java.util.List;

import second.assignment.chatroom.Bot;
import second.assignment.chatroom.User;

public class Bot {
	
	private static Bot botInstance;
	List<User> users;
	
	private Bot() {
		
	}
	
	public static Bot getBotInstance() {
		if(botInstance == null) {
			botInstance = new Bot();
		}
		return botInstance;
	}

	public void getUsersInfo(List<User> users) {
		this.users = users;
	}

	public void addBotMessage(User user) {
		String botAddedMessage = user.username + " added a bot.";
		for(User u : users) {
			u.receiveMessage(botAddedMessage);
		}
	}
	
	public void checkUserMessage(User user, String message) {
		String forbiddenWord = "cat";
		if(message.toLowerCase().contains(forbiddenWord)) {
			String removalMessage = user.username + " sent cat whitch is a forbidden word for this chat. This user was removed!";
			users.remove(user);
			for(User u : users) {
				u.receiveMessage(removalMessage);
			}
		}
	}
}
