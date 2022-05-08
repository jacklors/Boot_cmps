package com.digital.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
@Value("${app.message}")
	private String appMessage;

@Value("${ENV_DB_URL:NENHUMA}")
	private String dbEnvironmentVariable;


@GetMapping("/")
	public String getMessage(){
		
	return appMessage;
		
	}

@GetMapping("/envVariabel")

	public String getEnvironmentVariable() {
		
		return "A seguinte variável de ambiente foi passada: " +dbEnvironmentVariable;
		
		
	}
	
	
}
