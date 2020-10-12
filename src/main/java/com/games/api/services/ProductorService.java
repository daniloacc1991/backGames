package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.ProductorDao;
import com.games.api.entities.Productor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductorService implements CrudService<Productor, Long> {

    @Autowired
    private ProductorDao productorRepository;

    @Override
    public List<Productor> findAll() {
        return this.productorRepository.findAll();
    }

    @Override
    public Productor saveOrUpdate(Productor productor) {
        return this.productorRepository.save(productor);
    }

    @Override
    public Long delete(Long id) {
        this.productorRepository.deleteById(id);
        return id;
    }

    @Override
    public Productor findOneById(Long id) {
        return this.productorRepository.findById(id).orElse(null);
    }

}
