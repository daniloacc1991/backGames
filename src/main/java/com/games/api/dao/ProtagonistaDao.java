package com.games.api.dao;

import com.games.api.entities.Protagonista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtagonistaDao extends JpaRepository<Protagonista, Long>{
    
}
