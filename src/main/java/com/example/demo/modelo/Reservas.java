package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")

public class Reservas {
	
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int fecha;
	private String tipo;
	private int cant_personas;
	private String descripcion;
	private String estado;
	
	@ManyToOne
	private Usuarios id_usuario;
	
	//Metodo constructor
	public Reservas(int fecha, String tipo, int cant_personas, String descripcion, String estado, Usuarios id_usuario) {
		super();
		this.fecha = fecha;
		this.tipo = tipo;
		this.cant_personas = cant_personas;
		this.descripcion = descripcion;
		this.estado = estado;
		this.id_usuario = id_usuario;
	}
	
	public Reservas() {
	}

	//Setters y Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCant_personas() {
		return cant_personas;
	}

	public void setCant_personas(int cant_personas) {
		this.cant_personas = cant_personas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuarios getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}
}
