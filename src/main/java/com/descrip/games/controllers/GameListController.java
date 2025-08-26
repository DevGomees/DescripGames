package com.descrip.games.controllers;

import com.descrip.games.dto.GameListDTO;
import com.descrip.games.dto.GameMinDTO;
import com.descrip.games.dto.ReplacementDTO;
import com.descrip.games.services.GameListService;
import com.descrip.games.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSouceIndex(), body.getDestinationIndex());
    }

}
