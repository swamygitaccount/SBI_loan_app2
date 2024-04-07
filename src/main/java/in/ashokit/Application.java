package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	int i =10;
	String s = 'mike';
	int j = 20;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	
	}

}
