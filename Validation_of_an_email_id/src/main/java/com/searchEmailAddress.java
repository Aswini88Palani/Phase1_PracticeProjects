package com;

import java.util.ArrayList;
import java.util.Scanner;

public class searchEmailAddress {
	public static void main(String[] args) {
		
		ArrayList<String> email = new ArrayList<String>();
		
		email.add("employee1@gmail.com");
		email.add("employee2@gmail.com");
		email.add("employee3@gmail.com");
		email.add("employee4@gmail.com");
		email.add("employee5@gmail.com");
		email.add("employee6@gmail.com");
		email.add("employee7@gmail.com");
		email.add("employee8@gmail.com");
		email.add("employee9@gmail.com");
		email.add("employee10@gmail.com");
		
		String searchEmailAddress = null;
		System.out.println("Enter an email address to search: ");
		Scanner sc = new Scanner(System.in);
		searchEmailAddress = sc.nextLine();
		
		if(email.contains(searchEmailAddress)){
			System.out.println("");
		    System.out.println("Email " + searchEmailAddress + " is found");
		}
		else{
			System.out.println("");
			System.out.println("Email " + searchEmailAddress + " is NOT found");
		}
	}
}
