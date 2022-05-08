package com.interfa;



class Caculadora implements OperacaoMatematica{

	@Override
	public void soma(double operando1, double operando2) {
		// TODO Auto-generated method stub
		
		System.out.println("Soma: " + operando1 + operando2);
		}

	@Override
	public void subtracao(double operando1, double operando2) {
		// TODO Auto-generated method stub
		System.out.println("Subtração: " +(operando1 - operando2));
	}

	@Override
	public void multiplicacao(double operando1, double operando2) {
		// TODO Auto-generated method stub
		System.out.println("multiplicacao: " +operando1 * operando2);
	}

	@Override
	public void divisao(double operando1, double operando2) {
		// TODO Auto-generated method stub
		System.out.println("Divisão:  "+ operando1 / operando2);
	}


	}
	