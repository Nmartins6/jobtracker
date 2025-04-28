package dev.jobtracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobtrackerApplication.class, args);
	}
}
