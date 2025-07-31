import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Number Guessing Game!");
		
		
		Random ranNum = new Random();
		int secretNum = ranNum.nextInt(100);
		System.out.println("Computer: I picked a number between 1 to 100, try to guess it");
		
		Scanner input = new Scanner(System.in);
		int guess = 0;
		
		
		while(guess != secretNum) {
			System.out.println("Guess a number: ");
			int guessNum = input.nextInt();
			
			if(guessNum > secretNum) {
				System.out.println("your number is too high");
			} else if (guessNum < secretNum) {
				System.out.println("your number is too low");
			} else {
				System.out.println("Correct!");
			}
		}
		
		input.close();
	}

}
