package com.trovicor;

import com.trovicor.util.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class EcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsApplication.class, args);
	}
}
