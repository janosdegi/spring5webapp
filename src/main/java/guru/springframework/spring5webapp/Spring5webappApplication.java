package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		//Terminal: D:\workspace_spring\spring5webapp>mvnw spring-boot:run

		//h2 (embedded) database console url: http://localhost:8080/h2-console

		//http://localhost:8080/authors

		SpringApplication.run(Spring5webappApplication.class, args);
	}
}
