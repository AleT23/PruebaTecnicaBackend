package com.example.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuarios;
import com.example.demo.servicio.UsuariosServicio;

@RestController
@RequestMapping ("/Usuarios/")
public class UsuariosRest {

	@Autowired
	private UsuariosServicio usuariosServicio;
	
	@GetMapping
	private ResponseEntity<List<Usuarios>> getAllUsuarios(){
		return ResponseEntity.ok(usuariosServicio.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Usuarios>> getAllUsuariosByRoles(@PathVariable("id") int idRoles){
		return ResponseEntity.ok(usuariosServicio.findAllByUsuariosByRoles(idRoles));
	}
	
	@PostMapping
	private ResponseEntity<Usuarios> SaveUsuarios (@RequestBody Usuarios usuario){
		
		try {
			Usuarios nuevo = usuariosServicio.save(usuario);
		return ResponseEntity.created(new URI("/Usuarios/"+nuevo.getId())).body(nuevo);
		
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
