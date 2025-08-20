package com.devsuperior.gameslist.repositories;

import com.devsuperior.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
