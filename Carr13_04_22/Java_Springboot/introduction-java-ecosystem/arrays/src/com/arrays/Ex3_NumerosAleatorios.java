package com.arrays;

import java.util.Random;

/*
Fa�a um Programa que leia 20 n�meros inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os n�meros e seus sucessores.
*/

public class Ex3_NumerosAleatorios {


	    public static void main(String[] args) {
	        Random random = new Random(); //classe para gerar n�meros aleat�rios

	        int[] numeros = new int[20]; //array com 20 posi��es

	        //para: vari�vel i = numero, at� i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
	        for (int i = 0; i < numeros.length; i++) {
	            int numero = random.nextInt(100); //pegando um n�mero aleat�rio entre 0 e 100.
	            numeros[i] = numero; //atribuindo esse valor ao elemento na respectiva posi��o do array numeros.
	        }

	        System.out.print("Numeros: "); //frase ilustrativa
	        //loop for-each
	        for (int numero : numeros) { //para cada numero dentro do array de n�meros
	            System.out.print(numero + " "); //imprima o n�mero
	        }

	        System.out.println("\n-----------------"); //separar os vetores

	        System.out.print("Sucessores: "); //frase ilustrativa
	        for (int numero : numeros) { //para cada numero dentro do array de n�meros
	            System.out.print((numero + 1) + " "); //adicione o valor 1 ao n�mero e imprima esse novo valor
	        }
	    }
	}