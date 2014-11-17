package br.com.rafaelmurata.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import com.wordnik.swagger.jaxrs.JaxrsApiReader;

@Configuration
@ComponentScan("br.com.rafaelmurata")
@EnableSpringConfigured
public class AppContext {
	static {
		JaxrsApiReader.setFormatString("");
	}
}