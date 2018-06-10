package com.spring.core.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloIndiaConfig {
	@Bean(name="helloindia")
	public HelloIndia getHelloIndia() {
		return new HelloIndia();
	}

}
