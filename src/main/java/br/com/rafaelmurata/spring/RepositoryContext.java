package br.com.rafaelmurata.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("br.com.rafaelmurata.services")
public class RepositoryContext {

}
