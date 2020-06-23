package br.com.teste.es.itau.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.es.itau.entities.InfoCep;

@Repository
public interface CepRepository extends JpaRepository<InfoCep, Long> {

}
