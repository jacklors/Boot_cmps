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
		System.out.print("Deseja inicar o programa: ? (Sim/Não)");
		String program = new Scanner(System.in).next();
		
	while (program != "Não" ) {
		
		System.out.println("Deseja usar calculadora para somar: ? (Sim/Não)");
		String decision= new Scanner(System.in).next();
		
		
		if (decision == "Sim") {
			
			
			
		}else if (decision == "Não") {
			
			System.out.print("Deseja usar calculadora para calcular imposto: ? (Sim/Não)");
			String decision2 = new Scanner(System.in).next();
			
			
			if (decision2 == "Sim") {
				
				
				
			}else if (decision2 == "Não") {
			
			
		} else {
			System.out.print("Opção Invalida! Digite corretamente: Sim ou Não.");
			return;
		}
			
		
		
			}System.out.print("Opção Invalida! Digite corretamente: Sim ou Não.");
			program = "Não";
			return;
			
			}

	return;*/
		}
}
