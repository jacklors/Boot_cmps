package com.structure.oo;

public class RodarAplicacao {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		//Construtor padrão
		Carro carro1 = new Carro();
		
		carro1.setCor("Azul");
		carro1.setModelo("BMW Séries 3°");
		carro1.setCapacidadeTanque(59);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6.39));
		
		
		//Sobrecarga
		Carro carro2 = new Carro ("Cinza","Mercedes-Benz Classe C",66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.46));
	}

}
