package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Roles;
import com.example.demo.servicio.RolesServicio;

@RestController
@RequestMapping ("/Roles/")
public class RolesRest {

	@Autowired
	private RolesServicio rolesServicio;
	
	@GetMapping
	private ResponseEntity<List<Roles>> getAllRoles(){
		return ResponseEntity.ok(rolesServicio.findAll());
	}
}
