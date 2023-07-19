package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuarios")

public class Usuarios {
	
	//Atributos
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nombre;
	private String apellido;
	private String tipo_documento;
	private int num_documento;
	private String email;
	private String contraseña; 

	@ManyToOne
	private Roles id_rol;

	//Metodo constructor
	public Usuarios(String nombre, String apellido, String tipo_documento, int num_documento, String email,
			String contraseña, Roles id_rol) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_documento = tipo_documento;
		this.num_documento = num_documento;
		this.email = email;
		this.contraseña = contraseña;
		this.id_rol = id_rol;
	}
	
	public Usuarios() {
	}
	
	//Setters y Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getNum_documento() {
		return num_documento;
	}

	public void setNum_documento(int num_documento) {
		this.num_documento = num_documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Roles getId_rol() {
		return id_rol;
	}

	public void setId_rol(Roles id_rol) {
		this.id_rol = id_rol;
	}
}
