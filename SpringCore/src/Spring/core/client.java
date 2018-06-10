package Spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.display("JAVA");
	}

}
