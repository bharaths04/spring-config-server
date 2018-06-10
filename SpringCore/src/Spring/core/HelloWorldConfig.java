package Spring.core;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HelloWorldConfig {
	
	@Bean(name="helloworld")
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}

}
