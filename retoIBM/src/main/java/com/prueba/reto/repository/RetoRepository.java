package com.prueba.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.reto.model.PruebaSumar;

@Repository
public interface RetoRepository extends JpaRepository<PruebaSumar, Integer>{
		
}
