package com.tiagoguedes.DSlist2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagoguedes.DSlist2.entities.Game;
import com.tiagoguedes.DSlist2.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		
		List<Game> result = gameRepository.findAll();
		return result;
	}
	

}
