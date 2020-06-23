package br.com.teste.es.itau.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.teste.es.itau.entities.InfoCep;
import br.com.teste.es.itau.repositories.CepRepository;

@Service
public class CepService {
	
	@Autowired
	private RestTemplate rt;
	
	@Autowired
	private CepRepository repository;
	
	public InfoCep retriveInfoCep(String cep) {
		ResponseEntity<InfoCep> exchange = rt.exchange(
				"http://viacep.com.br/ws/"+cep+"/json/", 
				HttpMethod.GET, 
				null, 
				InfoCep.class);
		return repository.save(exchange.getBody());
		
	}

}
