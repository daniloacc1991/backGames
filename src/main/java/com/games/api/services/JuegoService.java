package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.JuegoDao;
import com.games.api.entities.Juego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JuegoService implements CrudService<Juego, Long> {

    @Autowired
    private JuegoDao juegoRepository;

    @Override
    public List<Juego> findAll() {
        return (List<Juego>) this.juegoRepository.findAll();
    }

    @Override
    @Transactional()
    public Juego saveOrUpdate(Juego juego) {
        return this.juegoRepository.save(juego);
    }

    @Override
    public Long delete(Long id) {
        this.juegoRepository.deleteById(id);
        return id;
    }

    @Override
    public Juego findOneById(Long id) {
        return this.juegoRepository.findById(id).orElse(null);
    }

}
