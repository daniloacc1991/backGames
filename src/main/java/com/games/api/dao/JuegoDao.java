package com.games.api.dao;

import com.games.api.entities.Juego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuegoDao extends JpaRepository<Juego, Long> {

}
