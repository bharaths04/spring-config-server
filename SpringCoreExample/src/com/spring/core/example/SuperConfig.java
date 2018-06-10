package com.spring.core.example;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HelloWorldConfig.class,HelloIndiaConfig.class})
public class SuperConfig {
	

}
