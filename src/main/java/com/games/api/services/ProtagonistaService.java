package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.ProtagonistaDao;
import com.games.api.entities.Protagonista;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProtagonistaService implements CrudService<Protagonista, Long> {

    @Autowired
    private ProtagonistaDao protagonistaRepository;

    @Override
    public List<Protagonista> findAll() {
        return this.protagonistaRepository.findAll();
    }

    @Override
    public Protagonista saveOrUpdate(Protagonista protagonista) {
        return this.protagonistaRepository.save(protagonista);
    }

    @Override
    public Long delete(Long id) {
        this.protagonistaRepository.deleteById(id);
        return id;
    }

    @Override
    public Protagonista findOneById(Long id) {
        return this.protagonistaRepository.findById(id).orElse(null);
    }

}
