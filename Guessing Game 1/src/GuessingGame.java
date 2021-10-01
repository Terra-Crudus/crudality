/*  Emily Lederman
 * Guessing Game 1
 * Due: 09/30/21
 * Description: Generating random number between 10-20, 
 * user will try to guess it, 
 * code will output both numbers
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	static Scanner input; 
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int guess; //The users guess
		Random randGen; //random number generator

			//getting the users guess
		System.out.println("What number would you like to guess? I will generate one between ten and twenty. ");
		guess = input.nextInt();
		System.out.println("Your guess is " + guess);
		randGen = new Random();
		int answer; // int answer, number created that person guesses for
			//formula is (high - low + 1) + low
		answer = randGen.nextInt(20 - 10 + 1) + 10;
		System.out.println("The random number generated is " + answer);
		System.out.println("Your guess was " + guess);
		if (guess > answer)
		{
			System.out.println("The guess is too high.");
		}
		else
		{
			System.out.println("The guess is too low.");
		}
	}
	
}	
	
/* Problems and headbangers were: forgot to add Random randGen, 
continued to need space before end quotes so output looked correct*/