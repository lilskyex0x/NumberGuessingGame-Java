import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Number Guessing Game!");
		Scanner input = new Scanner(System.in);
		Random ranNum = new Random();
		String playAgain = "";
		
		do {
			int secretNum = ranNum.nextInt(100);
			int guess = 0;
			int counter = 0;
			boolean win = false;
			
			while (win == false) {
				System.out.println("Computer: I picked a number between 1 to 100, try to guess it");
				counter++;
				guess = input.nextInt();
				
				if(guess == secretNum) {
					win = true;
				} else if (guess > secretNum) {
					System.out.println("your number is too high");
				} else if (guess < secretNum) {
					System.out.println("your number is too low");
				}
				
				System.out.println("Congratulation your number is correct!");
				System.out.println("Your number was " + guess);
				System.out.println("It took you " + counter + " tried");
				
				playAgain = input.nextLine();
				System.out.println("Would you like to play another game? :" + playAgain);
				playAgain = input.nextLine();
				
			}
			
			
		} while (playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("Ok maybe next time!");
		System.exit(0);
		
		input.close();
	}
}
