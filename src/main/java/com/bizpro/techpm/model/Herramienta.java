package com.bizpro.techpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import com.bizpro.techpm.IdGenerator;

public class Herramienta {
	
	@Id 
	private String _id;
	private String idHerramienta;
	private String herramienta;
	
	@PersistenceConstructor
	public Herramienta(){
		this._id = IdGenerator.getId();
		this.idHerramienta = this._id;
	}

	public String getIdHerramienta() {
		return idHerramienta;
	}

	public void setIdHerramienta(String idHerramienta) {
		this.idHerramienta = idHerramienta;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

}
