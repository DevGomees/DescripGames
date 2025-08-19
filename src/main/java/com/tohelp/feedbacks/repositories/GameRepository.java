package com.tohelp.feedbacks.repositories;

import com.tohelp.feedbacks.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
