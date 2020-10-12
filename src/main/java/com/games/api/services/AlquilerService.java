package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.AlquilerDao;
import com.games.api.entities.Alquiler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquilerService implements CrudService<Alquiler, Long> {

    @Autowired
    private AlquilerDao alquierRepository;

    @Override
    public List<Alquiler> findAll() {
        return this.alquierRepository.findAll();
    }

    @Override
    public Alquiler saveOrUpdate(Alquiler alquiler) {
        return this.alquierRepository.save(alquiler);
    }

    @Override
    public Alquiler findOneById(Long id) {
        return this.alquierRepository.findById(id).orElse(null);
    }

    @Override
    public Long delete(Long id) {
        this.alquierRepository.deleteById(id);
        return id;
    }

}
