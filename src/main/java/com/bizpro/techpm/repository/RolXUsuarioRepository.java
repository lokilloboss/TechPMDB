package com.bizpro.techpm.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.bizpro.techpm.model.RolXUsuario;

@RepositoryRestResource(collectionResourceRel = "rolxusuario", path = "rolxusuario")
public interface RolXUsuarioRepository extends MongoRepository<RolXUsuario, String>{

	
	RolXUsuario findByusuario(
			@Param("usuario") String usuario); 
	
	@Query(value="{ 'usuario' : ?0 }", fields="{'rol' : 1}")
	RolXUsuario findrolByusuario(@Param("usuario") String usuario);
	
	
	
}
