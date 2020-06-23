package br.com.teste.es.itau.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate getRestTemplateInstance() {
		return new RestTemplate();
	}

}
