package com.heritage;

public class FazerAcontecer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pequei uma classe e estanciei um objeto nela
		Funcionario funcionario = new Funcionario();
		
		//Upcast
		Funcionario gerente = new Gerente();		
		Funcionario vendedor = new Vendedor();		
		Funcionario faxineiro = new Faxineiro();		
		
		//Downcast
		//Vendedor  vendedor = (Vendedor) new Funcionario();
	
		
		
	}

}
