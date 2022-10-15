package com.dio.desafioPadroesDeProjetosDio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioPadroesDeProjetosDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesDeProjetosDioApplication.class, args);
	}

}
