package com.dio;

	import java.io.IOException;
	import java.util.Scanner;
	
public class Age {

	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        int cont = 0;
	        double soma = 0;
	        double n = 0;
	        
	        //complete o codigo
	        while (n >= 0 ) {
	            n = leitor.nextInt();
	            if(n >= 0) {
	            cont = cont+ 1; 
	            soma += n;
	            
	            }

	        }
	        double media = soma / (int)cont;
	        System.out.println(String.format("%.2f", media));
	  
	    }

}