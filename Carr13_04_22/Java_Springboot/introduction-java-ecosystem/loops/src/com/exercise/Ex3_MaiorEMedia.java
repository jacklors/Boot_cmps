package com.exercise;

	/*
	Fa�a um programa que leia 5 n�meros
	e informe o maior n�mero
	e a m�dia desses n�meros.
	*/
	import java.util.Scanner;

	public class Ex3_MaiorEMedia {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados atrav�s do teclado

	        //vari�veis
	        double maior = 0; //guarda o maior n�mero
	        double soma = 0; //guarda a soma
	        double media; //guarda a m�dia

	        int count = 0; //controla o loop
	        //loop
	        do {
	            System.out.println("N�mero: "); //Pe�a um n�mero
	            double numero = scan.nextDouble(); //Entrada de dados, neste caso de um Double.

	            if (numero > maior) { //Caso o valor que o usu�rio digitou seja maior que o valor armazanado na vari�vel maior.
	                maior = numero; //atribua o valor deste n�mero a vari�vel maior.
	            }

	            soma = soma + numero; //some o n�mero informado pelo usu�rio com vari�vel soma (independente do valor)

	            count = count + 1; //some o valor 1 ao contador, at� que invalide a condi��o do loop. (count < 5)
	        } while (count < 5); //enquanto o contador tiver o valor menor que 5

	        media = soma / 5; //fa�a o c�lculo da m�dia. (soma/quantidade)

	        //imprimindo o maior n�mero digtados e a m�dia dos mesmos
	        System.out.println("Maior: " + maior + " - M�dia: " + media);
	    }

	}