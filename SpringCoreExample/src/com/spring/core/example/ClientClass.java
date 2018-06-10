package com.spring.core.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ClientClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SuperConfig.class);
		HelloWorld hello =(HelloWorld)applicationContext.getBean("helloWorld");
		hello.display("bharath");
		HelloIndia helloindia = (HelloIndia)applicationContext.getBean("helloindia");
		helloindia.display("panimalar");

	}

}
