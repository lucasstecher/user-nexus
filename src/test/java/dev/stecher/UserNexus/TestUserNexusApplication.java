package dev.stecher.UserNexus;

import org.springframework.boot.SpringApplication;

public class TestUserNexusApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserNexusApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
