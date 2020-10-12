package com.games.api.dao;

import com.games.api.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorDao extends JpaRepository<Director, Long> {

}
