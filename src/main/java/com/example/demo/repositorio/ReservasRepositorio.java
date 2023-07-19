package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Reservas;

public interface ReservasRepositorio extends JpaRepository<Reservas, Long>{

}
