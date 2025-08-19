package com.tohelp.feedbacks.services;

import com.tohelp.feedbacks.dto.GameMinDTO;
import com.tohelp.feedbacks.entities.Games;
import com.tohelp.feedbacks.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
