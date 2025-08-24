package com.devsuperior.gameslist.services;

import com.devsuperior.gameslist.dto.GameListDTO;
import com.devsuperior.gameslist.dto.GameMinDTO;
import com.devsuperior.gameslist.entities.GameList;
import com.devsuperior.gameslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
