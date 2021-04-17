package first.assignment.observer;

import first.assignment.observer.Observable;

public interface Observer {
	
	 void update();
	 void setProductState(Observable state);
	 
}
