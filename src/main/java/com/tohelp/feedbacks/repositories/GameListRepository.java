package com.tohelp.feedbacks.repositories;

import com.tohelp.feedbacks.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
