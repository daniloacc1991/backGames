package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import com.games.api.common.core.CrudController;
import com.games.api.entities.Productor;
import com.games.api.services.ProductorService;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "productores")
public class ProductorController implements CrudController<Productor, Long> {

    @Autowired
    private ProductorService productorService;

    @Override
    @GetMapping
    public List<Productor> findAll() {
        return this.productorService.findAll();
    }

    @Override
    @PostMapping
    public Productor create(@Valid @RequestBody Productor productor, Errors errores) {
        return this.productorService.saveOrUpdate(productor);
    }

    @Override
    @GetMapping(path = "{id}")
    public Productor findOne(Productor productor) {
        return this.productorService.findOneById(productor.getId());
    }

    @Override
    @PutMapping
    public Productor update(@RequestBody Productor productor) {
        return this.productorService.saveOrUpdate(productor);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Productor productor) {
        return this.productorService.delete(productor.getId());
    }

}
