package _07_duck;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck donald = new Duck("pizza", 15);
		donald.quack();
		donald.waddle();
		Cheetah bob = new Cheetah("donuts", 1000);
		bob.hunt();
		bob.run();
	}

}
