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

import com.example.demo.modelo.Usuarios;
import com.example.demo.repositorio.UsuariosRepositorio;

@Service
public class UsuariosServicio implements UsuariosRepositorio{

	@Autowired
	private UsuariosRepositorio usuariosRepositorio;

	public List<Usuarios> findAllByUsuariosByRoles(int id){
		List<Usuarios> usuariosRespuesta = new ArrayList<>();
		List<Usuarios> usuarios = usuariosRepositorio.findAll();
		for (int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getId_rol().getId()==id) {
				usuariosRespuesta.add(usuarios.get(i));
			}
		}
		return usuariosRespuesta;
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
	public void deleteAllInBatch(Iterable<Usuarios> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Usuarios> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuarios getById(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> findAll() {
		return usuariosRepositorio.findAll();
	}

	@Override
	public List<Usuarios> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Usuarios entity) {
		usuariosRepositorio.delete(entity);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Usuarios> entities) {
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
		return false;
	}

	@Override
	public Optional<Usuarios> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Usuarios> S save(S entity) {
		return usuariosRepositorio.save(entity);
	}

	@Override
	public List<Usuarios> findAll(Sort sort) {
		return usuariosRepositorio.findAll(sort);
	}

	@Override
	public Page<Usuarios> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Usuarios> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Usuarios> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuarios> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
