package com.bizpro.techpm.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import com.bizpro.techpm.IdGenerator;

public class Recurso {

	@Id
	private String _id;
	private String idRecurso;
	private String usuario;
	private String nombre;
	
	//List<proyecto> proyectos;
	
	@PersistenceConstructor
	public Recurso() {
		this._id = IdGenerator.getId();
		this.setIdRecurso(this._id);
	}

	public String getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(String idRecurso) {
		this.idRecurso = idRecurso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
