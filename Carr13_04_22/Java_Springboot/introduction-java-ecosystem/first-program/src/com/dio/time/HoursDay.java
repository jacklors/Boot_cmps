package com.dio.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//Class java.time.LocalDateTime;, to update the year according to the system.

public class HoursDay {

	public static void greeting (){
	
	// hora atual///
		
	int agora = LocalDateTime.now().getHour();
	
	if (agora > 18 && agora <= 23 ) {
		
		String turno = "Olá, Boa Noite!";
		System.out.print(turno);
		
	} else if (agora <= 18 && agora > 12){
		
		String turno = "Olá, Boa Tarde!";
		System.out.print(turno);

		
	} else if (agora <= 12 && agora >= 6){
		
		String turno = "Olá, Bom Dia!";
		System.out.print(turno);
		
	} else if (agora < 6 ){

		String turno = "Olá, Boa Madrugada!";
		System.out.print(turno);
	}
	
	}

	public static void insthour() {
		
		// data/hora atual
		LocalDateTime agora = LocalDateTime.now();

		// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dataFormatada = formatterData.format(agora);

		// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);

		// Data output.
		System.out.println(" Estamos em: " + dataFormatada + " ás: " + horaFormatada);
	}

}
