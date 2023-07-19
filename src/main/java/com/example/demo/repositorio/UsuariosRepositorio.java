package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Usuarios;

public interface UsuariosRepositorio extends JpaRepository<Usuarios, Long>{

}
