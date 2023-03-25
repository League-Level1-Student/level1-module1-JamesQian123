package _03_cat;

public class CatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("bob");
		cat.meow();
		cat.printName();
		while(cat.getLives() > 0) {
		cat.kill();
		}
	}

}
