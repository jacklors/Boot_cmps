package com.exercise;
/*
Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!=5.4.3.2.1=120
*/
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados atrav�s do teclado

        System.out.println("N�mero: "); //Pe�a um n�mero
        int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

        int multiplicacao = 1; //vari�vel para guardar o valor da multiplica��o dos valores.

        System.out.print(numero + "!="); //frase ilustrativo para indicar o fatorial

        //para: vari�vel i = numero, at� i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for(int i = numero; i > 0; i--) {
            multiplicacao *= i; //multiplicamos os valores de i e armazenamos na vari�vel multiplica��o

            //criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado no exerc�cio.
            if (i != 1) { //se o i tiver o valor diferente de 1
                System.out.print(i + "."); //imprima o valor do i seguido de "."
            } else { //se n�o (se o i tiver o valor igual a 1)
                //imprima o valor do i seguido do sinal "=" e o resultado da multiplica��o
                System.out.print(i + "=" + (multiplicacao));
            }
        }
    }
}