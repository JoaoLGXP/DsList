package com.lucadev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucadev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
