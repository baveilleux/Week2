package com.github.baveilleux.week2;

import java.util.Scanner;

public class Week2Example {
	
	// this must be how you insert comments //
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if (name.equals("Trevor") 
				& age.equals("36")) {
			System.out.println("Holy cow it's me!");
		} else {
			System.out.println("Hello: " + name);
		}	
		
		scanner.close();
	}
}
