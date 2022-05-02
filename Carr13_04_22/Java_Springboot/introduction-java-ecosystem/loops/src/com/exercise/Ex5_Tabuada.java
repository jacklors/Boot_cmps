package com.exercise;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados atrav�s do teclado

        System.out.println("N�mero: "); //Pe�a um n�mero
        int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

        System.out.println("Tabuada de " + numero + ":");//frase ilustrativa para indicar a tabuada

        //para: vari�vel i = 0, at� i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for (int i = 0; i <= 10; i = i + 1) {
            //n�mero escolhido pelo usu�rio "X" o valor de i "=" a multiplica��o do n�mero com o i.
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}