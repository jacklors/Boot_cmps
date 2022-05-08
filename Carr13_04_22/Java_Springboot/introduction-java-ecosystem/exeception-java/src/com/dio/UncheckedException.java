package com.dio;

import javax.swing.*;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continueLooping = true;
		
		do {
			
			String a = JOptionPane.showInputDialog("Numerador: ");
			
			String b = JOptionPane.showInputDialog("Denominador: ");
			//
			try {
			int resultado = dividir (Integer.parseInt(a), Integer.parseInt(b));
			System.out.println("Resultado: " + resultado);
			continueLooping = false;
			
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada inv�lida, informe um n�mero inteiro!"+ e.getMessage());
				e.printStackTrace();
			}catch (ArithmeticException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Impossivel dividir um n�mero por 0.");
				
			}
			
			finally {
				System.out.println("Chegou no finally!");
			}
			
			
		}while(continueLooping);
		
		
		
		System.out.println("O codigo continua.....");
	}
	
	
	public static int dividir (int a, int b) { 
	return a / b ;
	
	}

	}
