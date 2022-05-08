package com.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
	
	public static void main (String [ ] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String[ ] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
		
		int media = calculaMediaDaTurma(alunos, scan);
		
		System.out.printf("Média da turma %d", media);

		
	}
	
	public static int calculaMediaDaTurma(String[] alunos, Scanner scanner)  {
		
		int soma = 0;
		for (String aluno : alunos) {
			System.out.printf("Média do aluno %s:  ", aluno);
		
			int nota = scanner.nextInt();
			soma += nota;
		}
		
		return (soma / alunos.length);
		
		
	}

}
