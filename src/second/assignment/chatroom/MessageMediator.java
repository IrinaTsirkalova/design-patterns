package second.assignment.chatroom;

public interface MessageMediator {
	void sendMessage(String message, User user);
	void addUser(User user);
}
