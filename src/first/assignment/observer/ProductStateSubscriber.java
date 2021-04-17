package first.assignment.observer;

import first.assignment.observer.Observable;

public class ProductStateSubscriber implements Observer {
	
	private String username;
	private Observable productState = null;
	

	public String getUsername() {
		return username;
	}
	
	
	public ProductStateSubscriber(String username) {
		this.username = username;
	}
	
	@Override
	public void update() {
		String newState = productState.getUpdate();
		if("".equals(newState)) {
			System.out.println("Hello " + getUsername() + ", no update available"  );
		
		}
		
		System.out.println("Hello " + getUsername() + ", the product you have subscribed to has quantity update: " + newState);
		
	}

	@Override
	public void setProductState(Observable state) {
		this.productState = state;

	}

}
