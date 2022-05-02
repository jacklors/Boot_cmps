package com.dio.calculator;

import java.util.Scanner;

public class Calculator {
	
	private static Scanner input;
	public static void main () {
		// TODO Auto-generated method stub
		
				
		int a,b;
	
		System.out.println("Enter the first value: ");
		input = new Scanner(System.in);
		a = input.nextInt();
		System.out.println("Enter the second value: ");
		b = input.nextInt();

		int som = add(a,b);
		int sub = sub(a,b);
		float div = div(a,b);
		int mul = mul( a,b);
	
		System.out.println("Addition: "+ som);
		System.out.println("Subtraction: "+ sub);
		System.out.println("Division: " + div);
		System.out.println("Multiplication: "+mul);
	

	}
	
	public static int add (int a, int b) {
		return a + b;
	
	
	}
	public static int sub (int a, int b) {
		return a - b;
		
	}
	public static int div (int a, int b) {
		return a / b;
		
	}
	public static int mul (int a, int b) {
		return a * b;
		
	}

	
	
}

