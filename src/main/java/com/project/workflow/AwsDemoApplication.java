package com.project.workflow;

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
	return "Hi Buddy, Ur attempt is success";  
	}  

}
