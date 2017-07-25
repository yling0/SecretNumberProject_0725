package SecretNumber;

import java.util.Scanner;
import java.util.Random;

public class SecretNumber {
	public static void main(String[] args){
		int snumber = 0; String answer = null;
		
		Random r = new Random();
		int x = 1 + r.nextInt(50);
		
		do {
			System.out.println("Enter your number");
			Scanner number1 = new Scanner (System.in);
			snumber = number1.nextInt();
		
			 if (snumber>x){
				System.out.println("You guessed too high, try again? (Y/N)");
				Scanner answer1 = new Scanner (System.in);
				answer = answer1.nextLine();
				}
			 
			 if (snumber<x){
				 System.out.println("You guessed too low, try again? (Y/N)");
				 Scanner answer2 = new Scanner (System.in);
				 answer = answer2.nextLine();
			 }
			 
			 if (snumber==x) {
				 System.out.println("You win!"); 
			 }
			
		} while (answer.equalsIgnoreCase("y")&&snumber!=x);
			
		
	}

}
