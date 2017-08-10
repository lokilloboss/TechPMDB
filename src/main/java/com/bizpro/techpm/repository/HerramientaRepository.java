package com.bizpro.techpm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bizpro.techpm.model.Herramienta;

@RepositoryRestResource(collectionResourceRel = "herramienta", path = "herramienta")
public interface HerramientaRepository extends MongoRepository<Herramienta, String>{

}
