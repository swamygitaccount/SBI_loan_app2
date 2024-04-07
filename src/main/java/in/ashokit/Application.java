package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

<<<<<<< HEAD
	int i =10;
=======
	String s = 'mike';
>>>>>>> 0ffe2c9 (initial commit)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	
	}

}
