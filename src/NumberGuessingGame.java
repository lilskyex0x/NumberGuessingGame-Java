import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to my Number Guessing Game!");
		Scanner input = new Scanner(System.in);
		Random ranNum = new Random();
		String playAgain = "";
		
		
		
		do {
			int gameMode;
			int guess = 0;
			int counter = 0;
			boolean win = false;
			gameMode = chooseDifficulty(input);
			
			if (gameMode == 1) {
				int easyNum = ranNum.nextInt(10);
				System.out.println("Computer: I picked a number between 1 to 10, try to guess it");
				
				while (win == false) {
					counter++;
					guess = input.nextInt();
					
					if(guess == easyNum) {
						win = true;
						System.out.println("Congratulation your number is correct!");
						System.out.println("Your number was " + guess);
						System.out.println("It took you " + counter + " tried");
						playAgain = input.nextLine();
						System.out.println("Would you like to play another game? :" + playAgain);
						playAgain = input.nextLine();
					} else if (guess > easyNum) {
						System.out.println("your number is too high");
					} else if (guess < easyNum) {
						System.out.println("your number is too low");
					}
					
				}
				
			} else if (gameMode == 2) {
				int normalNum = ranNum.nextInt(20);
				System.out.println("Computer: I picked a number between 1 to 20 try to guess it");

				while (win == false) {
					counter++;
					guess = input.nextInt();
					
					if(guess == normalNum) {
						win = true;
						System.out.println("Congratulation your number is correct!");
						System.out.println("Your number was " + guess);
						System.out.println("It took you " + counter + " tried");
						playAgain = input.nextLine();
						System.out.println("Would you like to play another game? :" + playAgain);
						playAgain = input.nextLine();
					} else if (guess > normalNum) {
						System.out.println("your number is too high");
					} else if (guess < normalNum) {
						System.out.println("your number is too low");
					}
					
				}
				
			} else if (gameMode == 3) {
				int hardNum = ranNum.nextInt(30);
				System.out.println("Computer: I picked a number between 1 to 30 try to guess it");
				
				while (win == false) {
					counter++;
					guess = input.nextInt();
					
					if(guess == hardNum) {
						win = true;
						System.out.println("Congratulation your number is correct!");
						System.out.println("Your number was " + guess);
						System.out.println("It took you " + counter + " tried");
						playAgain = input.nextLine();
						System.out.println("Would you like to play another game? :" + playAgain);
						playAgain = input.nextLine();
					} else if (guess > hardNum) {
						System.out.println("your number is too high");
					} else if (guess < hardNum) {
						System.out.println("your number is too low");
					}
					
				}
			}
			
		} while (playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("Ok maybe next time!");
		System.exit(0);
		input.close();
	}

	private static int chooseDifficulty(Scanner input) {
		int gameMode;
		System.out.println("Select difficulty level");
		System.out.println("1. Easy");
		System.out.println("2. Normal");
		System.out.println("3. Hard");
		gameMode = input.nextInt();
		return gameMode;
	}
}
