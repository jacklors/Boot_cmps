package com.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Crie um vetor de 6 n�meros inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] vetor = {5, 8, 9, 6, 11, -1}; //inicializando um vetor com 5 elementos.

        int count = (vetor.length - 1); //o contador dever� ser um n�mero menor que o tamanho do vetor.
        System.out.print("Vetor Inverso: "); //Frase ilustrativa
        //loop
        while (count >= 0) { //enquanto o contador tiver o valor maior ou igual 0
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posi��o indicada pelo contador.
            count--; //diminua o valor 1 do contador a cada loop
        }

        System.out.println("\n--------------"); //separar os vetores

        System.out.print("Vetor: "); //Frase ilustrativa
        //loop for-each
        for (int elemento : vetor) { //para cada elemento dentro do vetor
            System.out.print(elemento + " "); //imprima o elemento
        }
    }
}