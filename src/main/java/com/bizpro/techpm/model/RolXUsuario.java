package com.bizpro.techpm.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

import com.bizpro.techpm.IdGenerator;

public class RolXUsuario {
	
	@Id 
	private String _id;
	private String idRolXUsuario;
	private String usuario;
	private Integer rol;
	
	@PersistenceConstructor
	public RolXUsuario(){
		this._id = IdGenerator.getId();
		this.idRolXUsuario = this._id;		
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getIdRolXUsuario() {
		return idRolXUsuario;
	}

	public void setIdRolXUsuario(String idRolXUsuario) {
		this.idRolXUsuario = idRolXUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}
	
	

}
