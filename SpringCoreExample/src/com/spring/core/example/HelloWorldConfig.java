package com.spring.core.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HelloWorldConfig {
	
	   @Bean(name="helloWorld")
	    public HelloWorld getHellloWorld()
	    {
	        return new HelloWorld();
	    }
	

}
