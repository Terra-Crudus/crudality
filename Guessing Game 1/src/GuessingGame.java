import java.util.Scanner;

public class GuessingGame {
	static Scanner input; 
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess;
		
		System.out.println("What number would you like to guess?");
		guess = input.nextInt();
		
		System.out.println("Your guess is " + guess);
	}

}
