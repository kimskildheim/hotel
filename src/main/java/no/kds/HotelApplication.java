package no.kds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(HotelApplication.class, args);

		System.out.println("Beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
