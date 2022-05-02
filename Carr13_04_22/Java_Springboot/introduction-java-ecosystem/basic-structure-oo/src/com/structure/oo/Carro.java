package com.structure.oo;

public class Carro {
	String cor;
	String modelo;
	int capacidadeTanque;

	// Construtor 
	
	
	Carro(){
		
		
		
	}
	
	
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
		//this. é para tirar ambiguidade do tributo com os parâmetros.
		
		
	}
	void setCor(String cor) {
		this.cor = cor;
		
		
	}
	
	String getCor() {
		return cor;
		
	}
	
	void  setModelo (String modelo) {
	this.modelo = modelo;
		
	}
	
	String getModelo() {
		return modelo;
		
		
	}
	
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
		
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;
		
	}
	
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
		
	}
	
}
