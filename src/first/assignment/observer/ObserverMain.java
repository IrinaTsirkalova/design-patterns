package first.assignment.observer;

import first.assignment.observer.Observer;
import first.assignment.observer.Product;
import first.assignment.observer.ProductStateSubscriber;

public class ObserverMain {

	public static void main(String[] args) {
		
		Product sunglasses = new Product();

		Observer user1 = new ProductStateSubscriber("Annie");
		Observer user2 = new ProductStateSubscriber("Marie");
		Observer user3 = new ProductStateSubscriber("Lucia");
		
		sunglasses.addSubscriber(user1);
		sunglasses.addSubscriber(user2);
		sunglasses.addSubscriber(user3);

		sunglasses.setProductState("The black sun glasses are back in stock!");
		sunglasses.setProductState("Hurry up! Only three products left in stock!");
		
		
		
	}
}
