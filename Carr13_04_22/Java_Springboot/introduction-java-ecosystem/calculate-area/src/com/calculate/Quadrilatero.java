package com.calculate;

/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */
public class Quadrilatero {

    public static double area(double lado) {

    	return lado * lado;
        //System.out.println("Área do quadrado:" + lado * lado);
    }

    public static double area(double lado1, double lado2) {
    	
    	return lado1 * lado2;
       // System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

    	return ((baseMaior+baseMenor)*altura) / 2;
        //System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static float area(float diagonal1, float diagonal2) {

    	return(diagonal1 * diagonal2)/2;
       // System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}