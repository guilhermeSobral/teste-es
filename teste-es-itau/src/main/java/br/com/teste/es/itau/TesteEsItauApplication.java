package br.com.teste.es.itau;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;

@SpringBootApplication
public class TesteEsItauApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteEsItauApplication.class, args);
	}

}
