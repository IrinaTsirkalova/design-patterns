package first.assignment.observer;

import java.util.ArrayList;
import java.util.List;

import first.assignment.observer.Observer;

public class Product implements Observable {


	private List<Observer> observers;// users as list, database simulation
	private String productState;
	
	public Product() {
		this.observers = new ArrayList<>();//initialize users as ArrayList, database simulation
	}
	
	@Override
	public void addSubscriber(Observer user) {
		observers.add(user);// add user in subscribers' database
		user.setProductState(this);//set product state for the users, so they can see it after subscription
	}

	@Override
	public void removeSubscriber(Observer user) {
		observers.remove(user);// remove user from subscribers list

	}

	@Override
	public void notifySubscribers() {
		for(Observer user: observers) {
			user.update();// notify user if there is change in the subscribed product state
		}

	}

	@Override
	public String getUpdate() {
		return productState;// get the new product state
	}
	
	public void setProductState(String newState) {
		productState = newState;// set the new product state
	    notifySubscribers();// after update, notify all subscribers
	}
}
