package com.calculate;

public class Calculate {

	public static void main(String[] args) {

		        // Quadril�tero
		        /*System.out.println("Exerc�cio quadril�tero");
		        Quadrilatero.area(3);
		        Quadrilatero.area(5d,5d);
		        Quadrilatero.area(7,8,9);
		        Quadrilatero.area(5f,5f);
		        */
		
	       // Retornos
        System.out.println("Exerc�cio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("�rea do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("�rea do ret�ngulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("�rea do trap�zio:" + areaTrapezio);

    }
}
