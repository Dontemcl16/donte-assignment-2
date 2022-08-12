package com.codercampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 100");
		
		int x = 0;
		int guess;
		boolean playerGuess = false;
		
		while(!playerGuess) {
			x = random.nextInt(100) + 1;		}
		
		for(int numberOfAttempts = 0; numberOfAttempts < 5; numberOfAttempts++) {	
			guess = scanner.nextInt();			
			if(guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				numberOfAttempts--;
			}
			if (guess != x) {
				if(guess > x && guess >= 1 && guess <= 100) {
					System.out.println("please pick a lower number");
				} 
			} 
			if (guess < x && guess >= 1 && guess <= 100) {
				System.out.println("Please pick a higher number");
			}
			if (numberOfAttempts == 4 && guess != x) {
				System.out.println("You lose! The number to guess was " + x);
				playerGuess = true;
				break;
			}
			
		}	
			
			
			scanner.close();
	}
}
