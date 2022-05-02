package com.arrays;

import java.util.Random;
	/*
	Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9.
	Ap�s isso determine o menor n�mero da matriz e a sua posi��o(linha, coluna).
	*/
public class Ex4_ArrayMultidimensional {

	    public static void main(String[] args) {
	        Random random = new Random(); //classe para gerar n�meros aleat�rios

	        int[][] M = new int[4][4]; //declara��o de uma matriz multidimensional

	        //vari�veis
	        int menor = Integer.MIN_VALUE; //vari�vel que guarda o menor valor
	        int linha = 0, coluna = 0; //posi��o inicial da linha e da coluna

	        //para: vari�vel i = 0, at� i menor que o tamanho da matriz (array multidimencional), acrescentamos 1 ao valor de i a cada loop.
	        for (int i = 0; i < M.length; i++) { //navegando na matriz
	            //para: vari�vel j = 0, at� i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
	            for (int j = 0; j < M[i].length; j++) { //navegando na linha (array unidimensional)
	                M[i][j] = random.nextInt(9); //atribuindo um n�mero aleat�riamente a posi��o do elemento

	                //se o elemento em uma determinada posi��o (linha e coluna) � menor que o menor n�mero
	                if (M[i][j] < menor) {
	                    menor = M[i][j]; //o valor da vari�vel menor passa a ser o valor aleat�rio
	                    linha = i; //que est� na linha representada pela vari�vel i
	                    coluna = j; //que esta na coluna representada pela vari�vel j
	                }
	            }
	        }
	        System.out.println("Menor: " + menor); //menor valor
	        System.out.println("Linha: " + linha); //linha que se encontra o menor valor
	        System.out.println("Coluna: " + coluna); //coluna que se encontra o menor valor

	        System.out.println("\nMatriz"); //Mensagem ilustrativa
	        for (int[] linhaM: M) { //para cada linha da matriz M
	            for (int colunaM : linhaM) { //pegue a coluna desta linhaM
	                System.out.print(colunaM + " "); //imprima esta coluna
	            }
	            System.out.println(); //pular uma linha
	        }
	    }
	}