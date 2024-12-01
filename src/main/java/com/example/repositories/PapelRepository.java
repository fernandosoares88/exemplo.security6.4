package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long>{
	
	Papel findByNome(String nome);

}
