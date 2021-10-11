package one.jkr.de.jkrsoftware.entity.locking.libraries.dynamoDb.locking.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamoDbLockingLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamoDbLockingLibraryApplication.class, args);
	}

}
