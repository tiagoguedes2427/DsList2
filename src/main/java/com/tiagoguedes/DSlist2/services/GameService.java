package com.tiagoguedes.DSlist2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiagoguedes.DSlist2.DTO.GameDTO;
import com.tiagoguedes.DSlist2.DTO.GameMinDTO;
import com.tiagoguedes.DSlist2.entities.Game;
import com.tiagoguedes.DSlist2.repositories.GameRepository;

/* O repotitory é uma classe que implementa as regras de 
 * negócio. Service devolve DTO
 * */

@Service
public class GameService {
	
	//Injetando uma instância do GameRepository no 
	//GameService
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		//GameDTO dto = new GameDTO(result);
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<Game> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result;
				//.stream().map(x -> new GameMinDTO(x).toList());
	}
	

}
