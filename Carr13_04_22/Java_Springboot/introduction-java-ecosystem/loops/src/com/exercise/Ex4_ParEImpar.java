package com.exercise;
	/*
	Fa�a um programa que pe�a N n�meros inteiros,
	calcule e mostre a quantidade de n�meros pares
	e a quantidade de n�meros impares.
	*/
	import java.util.Scanner;

	public class Ex4_ParEImpar {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados atrav�s do teclado

	        System.out.println("Quantidade de n�meros: "); //Pe�a um n�mero
	        int quantidadeDeNumeros = scan.nextInt(); //Entrada de dados, neste caso de um int.

	        //vari�veis para guardar a quantidade dos n�meros pares e �mpares
	        int quantPar = 0, quantImpar = 0;

	        int count = 0; //controla o loop
	        //loop
	        do { //primeiro, independente do que tem no while, fa�a:
	            System.out.println("N�mero: "); //Pe�a um n�mero
	            int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

	            //se o resto da divis�o do n�mero por 2 (numero/2) for 0,
	            if (numero % 2 == 0) quantPar++; //acrescente o valor 1 a vari�vel quantPar.
	                //caso contr�rio, o n�mero digitado � �mpar
	            else quantImpar++; //adicione o valor 1 a vari�vel quantImpar.

	            count++; //some o valor 1 ao contador at� que invalide a condi��o do loop. (count < quantidadeDeNumeros)
	        } while (count < quantidadeDeNumeros);
	        // Fa�a o loop caso o valor do contador seja menor que a quantidade de n�meros

	        //imprimindo a quantidade de n�meros pares digtados e n�meros �mpares digitados
	        System.out.println("Quantidade n�meros pares: " + quantPar + " / Quantidade n�meros �mpares: " + quantImpar);
	    }
	}