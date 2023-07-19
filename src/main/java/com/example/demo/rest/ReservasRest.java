package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Reservas;
import com.example.demo.servicio.ReservasServicio;

@RestController
@RequestMapping ("/Reservas/")
public class ReservasRest {
	
	@Autowired
	private ReservasServicio reservasServicio;
	
	@GetMapping
	private ResponseEntity<List<Reservas>> getAllReservas(){
		return ResponseEntity.ok(reservasServicio.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Reservas>> getAllReservasByUsuarios(@PathVariable("id") int idUsuarios){
		return ResponseEntity.ok(reservasServicio.findAllByReservasByUsuarios(idUsuarios));
	}
}
