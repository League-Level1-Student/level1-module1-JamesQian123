package _07_duck;

public class Cheetah {
	
	String favoriteFood;
	int howManySpots;
	
	
	
	public Cheetah(String favoriteFood, int howManySpots){
		this.favoriteFood = favoriteFood;
		this.howManySpots = howManySpots;
	}
	public void run(){
		System.out.println("The cheetah runs");
	}
	public void hunt() {
		System.out.println("The cheetah hunts");
	}
}
