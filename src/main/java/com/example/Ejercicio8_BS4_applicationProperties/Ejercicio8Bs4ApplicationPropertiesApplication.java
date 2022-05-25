package com.example.Ejercicio8_BS4_applicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yml") //Le establecemos el path de nuestro .yml o .properties
public class Ejercicio8Bs4ApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio8Bs4ApplicationPropertiesApplication.class, args);
	}

}
