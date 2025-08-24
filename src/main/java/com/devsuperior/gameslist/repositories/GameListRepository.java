package com.devsuperior.gameslist.repositories;

import com.devsuperior.gameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
