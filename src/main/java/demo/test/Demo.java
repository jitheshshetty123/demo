package demo.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"demo.test"})
@SpringBootApplication
public class Demo {

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

}
