package _07_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;

	public Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}

	public void quack() {
		System.out.println("The duck quacks");
	}
	public void waddle() {
		System.out.println("The duck waddles");
		
	}


}
