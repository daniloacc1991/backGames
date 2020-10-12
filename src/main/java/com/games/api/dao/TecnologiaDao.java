package com.games.api.dao;

import com.games.api.entities.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnologiaDao extends JpaRepository<Tecnologia, Long>{
    
}
