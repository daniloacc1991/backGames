package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.TecnologiaDao;
import com.games.api.entities.Tecnologia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements CrudService<Tecnologia, Long>{
    
    @Autowired
    private TecnologiaDao tecnologiaRepository;

    @Override
    public List<Tecnologia> findAll() {
        return this.tecnologiaRepository.findAll();
    }

    @Override
    public Tecnologia saveOrUpdate(Tecnologia tecnologia) {
        return this.tecnologiaRepository.save(tecnologia);
    }

    @Override
    public Long delete(Long id) {
        this.tecnologiaRepository.deleteById(id);
        return id;
    }

    @Override
    public Tecnologia findOneById(Long id) {
        return this.tecnologiaRepository.findById(id).orElse(null);
    }
    
}
