package restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import restapi.service.StudentSamples;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		StudentSamples.fillStudentSamples();
		SpringApplication.run(DemoApplication.class, args);
	}

}
