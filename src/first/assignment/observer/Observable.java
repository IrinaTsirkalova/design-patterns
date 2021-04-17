package first.assignment.observer;

import first.assignment.observer.Observer;

public interface Observable {

	void addSubscriber(Observer observer);
	void removeSubscriber(Observer observer);
	
	void notifySubscribers();
	String getUpdate();
	
}
