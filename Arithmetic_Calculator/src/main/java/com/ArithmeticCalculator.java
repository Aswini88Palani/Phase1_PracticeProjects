package com;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		
		char operator;
		Double num1, num2, result;
		
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
			
		// ask users to enter operator
		System.out.println("Select an Operator: +, -, * or /");
		operator = sc.next().charAt(0);
		
		// ask users to enter numbers
		System.out.println("Enter the first number: ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		num2 = sc.nextDouble();
		
		switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = num1 + num2;
	        System.out.println("Addition of two numbers");
	        System.out.println("-----------------------");
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = num1 - num2;
	        System.out.println("Subtraction of two numbers");
	        System.out.println("--------------------------");
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = num1 * num2;
	        System.out.println("Multiplication of two numbers");
	        System.out.println("----------------------------");
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = num1 / num2;
	        System.out.println("Division of two numbers");
	        System.out.println("-----------------------");
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    sc.close();
	  }		
}
