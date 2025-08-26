package com.tohelp.feedbacks.dto;

import com.tohelp.feedbacks.entities.GameList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
