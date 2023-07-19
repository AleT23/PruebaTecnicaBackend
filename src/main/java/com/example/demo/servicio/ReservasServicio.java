package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Reservas;
import com.example.demo.repositorio.ReservasRepositorio;

@Service
public class ReservasServicio implements ReservasRepositorio{

	@Autowired
	private ReservasRepositorio reservasRepositorio;
	
	public List<Reservas> findAllByReservasByUsuarios(int id){
		List<Reservas> reservasRespuesta = new ArrayList<>();
		List<Reservas> reservas = reservasRepositorio.findAll();
		for (int i=0; i<reservas.size(); i++) {
			if(reservas.get(i).getId_usuario().getId()==id) {
				reservasRespuesta.add(reservas.get(i));
			}
		}
		return reservasRespuesta;
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch(Iterable<Reservas> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Reservas> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
	}

	@Override
	public Reservas getById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservas getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservas getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservas> findAll() {
		return reservasRepositorio.findAll();
	}

	@Override
	public List<Reservas> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Reservas entity) {
		reservasRepositorio.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Reservas> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Reservas> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Reservas> S save(S entity) {
		return reservasRepositorio.save(entity);
	}

	@Override
	public List<Reservas> findAll(Sort sort) {
		return reservasRepositorio.findAll(sort);
	}

	@Override
	public Page<Reservas> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Reservas> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Reservas> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Reservas> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
