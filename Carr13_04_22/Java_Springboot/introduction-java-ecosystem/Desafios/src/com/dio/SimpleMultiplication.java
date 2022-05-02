package com.dio;

import java.util.Scanner;

public class SimpleMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		PROD = A * B; //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " +  PROD);
		
		scan.close();
		
	}
}