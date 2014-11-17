package br.com.rafaelmurata.services;

import javax.ws.rs.Path;

import br.com.rafaelmurata.model.Category;
import br.com.rafaelmurata.rest.CrudService;

import com.wordnik.swagger.annotations.Api;

@Path("/categories")
@Api(value = "/categories", description = "Operations on categories")
public interface CategoryService extends CrudService<Category, Long> {

}

