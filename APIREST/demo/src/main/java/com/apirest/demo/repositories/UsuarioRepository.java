package com.apirest.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apirest.demo.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
   public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
   //find by model, find by email
    
}
