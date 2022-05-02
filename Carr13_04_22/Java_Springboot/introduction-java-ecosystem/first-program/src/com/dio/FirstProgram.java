package com.dio;

import java.util.Scanner;

import com.dio.calculator.Calculator;
import com.dio.tax.Tribute;
import com.dio.time.HoursDay;


/**
 * @author Jackson Loredo
 * @version 1.0.0
 * @since Release 1.0.0
 */

public class FirstProgram {
	
		public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------");
		
		HoursDay.greeting();
		HoursDay.insthour();
		
		System.out.println("--------------------------------------------------------------------------");
		
		Calculator.main();
		
		System.out.println("--------------------------------------------------------------------------");
		
		Tribute.main();
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		
		/**
		System.out.print("Deseja inicar o programa: ? (Sim/N�o)");
		String program = new Scanner(System.in).next();
		
	while (program != "N�o" ) {
		
		System.out.println("Deseja usar calculadora para somar: ? (Sim/N�o)");
		String decision= new Scanner(System.in).next();
		
		
		if (decision == "Sim") {
			
			
			
		}else if (decision == "N�o") {
			
			System.out.print("Deseja usar calculadora para calcular imposto: ? (Sim/N�o)");
			String decision2 = new Scanner(System.in).next();
			
			
			if (decision2 == "Sim") {
				
				
				
			}else if (decision2 == "N�o") {
			
			
		} else {
			System.out.print("Op��o Invalida! Digite corretamente: Sim ou N�o.");
			return;
		}
			
		
		
			}System.out.print("Op��o Invalida! Digite corretamente: Sim ou N�o.");
			program = "N�o";
			return;
			
			}

	return;*/
		}
}
