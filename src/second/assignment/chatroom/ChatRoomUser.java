package second.assignment.chatroom;

public class ChatRoomUser extends User{
	
	public ChatRoomUser(MessageMediator mediator, String username) {
		super(mediator, username);
		mediator.addUser(this);
	}

	@Override
	public void sendMessage(String message) {

		System.out.println(username + " sends:" +message);
		mediator.sendMessage(message, this);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(username + " received:" + message);
		 
	}
}
