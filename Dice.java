import java.util.Scanner;

public class Dice {
	int size, number;
	Dice(int size) {
		this.size = size;
	}
	String rollDice() {
		number = (int)(1 + Math.random()*(size));
		String value = null;
		switch(number) {
		case 1: value = "one";
						break;
		case 2: value = "two";
						break;
		case 3: value = "three";
						break;
		case 4: value = "four";
						break;
		case 5: value = "five";
						break;
		case 6: value = "six";
						break;
		}
		return value;
	}
	public static void main(String[] args) {
		System.out.println("Dice Number Generator");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==2 || n==4 || n==6) {
			System.out.println("Dice with sides " + n);
			Dice dice = new Dice(n);
			System.out.println("Random dice number: "+ dice.rollDice());
		}
		else System.out.println("Invalid dice number");
	}
}
