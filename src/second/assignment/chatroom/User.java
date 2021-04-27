package second.assignment.chatroom;

import second.assignment.chatroom.MessageMediator;

public abstract class User {
	protected MessageMediator mediator;//In our case the name of the chatroom
	protected String username;
	
	public User(MessageMediator mediator, String username){
		this.mediator = mediator;
		this.username = username;
	}
	
	public abstract void sendMessage(String message);
	
	public abstract void receiveMessage(String message);
}
