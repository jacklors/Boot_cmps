package com.dio.tax;

public class Tribute {
	
	public static void main () {
		
        System.out.println("Exerc�cio empr�stimo");
        Tribute.calcular(1000, Tribute.getDuasParcelas());
        Tribute.calcular(1000, Tribute.getTresParcelas());
        Tribute.calcular(1000, 5);
	}
	
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas n�o aceita.");
        
        
        }
    }
    
}
