package com.dio;

import java.time.YearMonth;



/**
 * @author Jackson Loredo
 * @version 1.0.0
 * @since Release 1.0.0
 */

public class FirstProgram {
	
		public static void main(String[] args ) {
	
		
		int year = YearMonth.now().getYear();
		//Class java.time.year, to update the year according to the system.
		
		System.out.println("Hello World!We are in the year of " + year  );
		// Data output.
	}

}
