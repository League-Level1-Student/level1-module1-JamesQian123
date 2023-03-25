package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want");
String timeAsString = JOptionPane.showInputDialog("How long do you want to pop your popcorn");
int time = Integer.parseInt(timeAsString);
Popcorn popcorn = new Popcorn("flavor");
Microwave microwave = new Microwave();
microwave.putInMicrowave(popcorn);
microwave.setTime(time);
microwave.startMicrowave();
popcorn.applyHeat();
	}

}
