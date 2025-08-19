package com.tohelp.feedbacks.repositories;

import com.tohelp.feedbacks.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games, Long> {
}
