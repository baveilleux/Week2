package com.github.baveilleux.week2;

import java.util.Scanner;

public class Week2Example {
	
	// this must be how you insert comments //
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1-400: ");
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
		System.out.println("You typed in: " + convertedInput);
		
		if (convertedInput < 50) {
			System.out.println("No!");
		} else if (convertedInput <= 300) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}
}
