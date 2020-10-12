package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.DirectorDao;
import com.games.api.entities.Director;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService implements CrudService<Director, Long> {

    @Autowired
    private DirectorDao directorRepository;

    @Override
    public List<Director> findAll() {
        return this.directorRepository.findAll();
    }

    @Override
    public Director saveOrUpdate(Director director) {
        return this.directorRepository.save(director);
    }

    @Override
    public Long delete(Long id) {
        this.directorRepository.deleteById(id);
        return id;
    }

    @Override
    public Director findOneById(Long id) {
        return this.directorRepository.findById(id).orElse(null);
    }

}
