package br.com.rafaelmurata.services;

import org.springframework.data.repository.CrudRepository;

import br.com.rafaelmurata.model.SupportCase;


public interface SupportCaseRepository extends CrudRepository<SupportCase, Long>{

}
