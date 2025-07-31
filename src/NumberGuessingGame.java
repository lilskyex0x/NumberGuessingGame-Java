import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Number Guessing Game!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = input.nextInt();
		System.out.println("Your number: " + num);
		
		Random genNum = new Random();
		int ranNum = genNum.nextInt(100);
		System.out.println("Random number: "+ ranNum);
		
		
		
		input.close();
	}

}
