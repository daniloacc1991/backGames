package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import lombok.extern.slf4j.Slf4j;

import com.games.api.common.core.CrudController;
import com.games.api.entities.Director;
import com.games.api.services.DirectorService;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "directores")
public class DirectorController implements CrudController<Director, Long> {

    @Autowired
    private DirectorService directorService;

    @Override
    @GetMapping
    public List<Director> findAll() {
        return this.directorService.findAll();
    }

    @Override
    @PostMapping
    public Director create(@Valid @RequestBody Director director, Errors errores) {
        return this.directorService.saveOrUpdate(director);
    }

    @Override
    @GetMapping(path = "{id}")
    public Director findOne(Director director) {
        return this.directorService.findOneById(director.getId());
    }

    @Override
    @PutMapping
    public Director update(@RequestBody Director director) {
        return this.directorService.saveOrUpdate(director);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Director director) {
        return this.directorService.delete(director.getId());
    }

}
