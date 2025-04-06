package kr.co.epicit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={
	"kr.co.epicit"
})
public class SpringBootWebApplication {

	public static void main(String... args) {
		SpringApplication.run( SpringBootWebApplication.class, args );
	}
	
}
