package com.project.workflow;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoApplication.class, args);
	}
	
	@GetMapping("/demo")  
	public String demo()
	{     
	return "Hi Buddy, Ur automation is success. Goto the next level";  
	}  

	//Below code is for handling put argument request
	public Map<String,String> putAWSAliens(String value) {
	
		Map<String,String> awsMap = new HashMap<>();
		return awsMap;
	}
	
	
}
