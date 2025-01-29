package com.tiagoguedes.DSlist2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoguedes.DSlist2.entities.Game;

/* O repository é uma interface que acessa e faz as requisições 
 * no bando de dados. o repotitory devolve entitade
 * */

public interface GameRepository extends JpaRepository<Game, Long>{

	
	
	
}
