package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


public class RestapiApplication {

	public static void main(String[] args) {}
		
		
	

	
		
		    private final String externalApiUrl = "https://example.com/api"; 
		    public void createRecord(Object data) {
		        RestTemplate restTemplate = new RestTemplate();
		        restTemplate.postForObject(externalApiUrl, data, Void.class);
		        { } }
		}


