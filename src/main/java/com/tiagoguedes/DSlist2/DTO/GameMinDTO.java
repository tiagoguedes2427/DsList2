package com.tiagoguedes.DSlist2.DTO;

import java.util.List;

import com.tiagoguedes.DSlist2.entities.Game;

/* DTO para resumir, ou usar apenas atributos que irei precisar
 * de uma determinada entitade
 * */
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	private Game game = new Game();
	
	public GameMinDTO() {}
	
	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
	/*
    public static List<GameMinDTO> listAllGames() {
        
		return List(game);
    }
    */

	
	
	
	
}
