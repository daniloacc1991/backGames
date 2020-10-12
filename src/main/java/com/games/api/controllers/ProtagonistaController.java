package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import com.games.api.common.core.CrudController;
import com.games.api.entities.Protagonista;
import com.games.api.services.ProtagonistaService;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "protagonistas")
public class ProtagonistaController implements CrudController<Protagonista, Long> {

    @Autowired
    private ProtagonistaService protagonistaService;

    @Override
    @GetMapping
    public List<Protagonista> findAll() {
        return this.protagonistaService.findAll();
    }

    @Override
    @PostMapping
    public Protagonista create(@Valid @RequestBody Protagonista protagonista, Errors errores) {
        return this.protagonistaService.saveOrUpdate(protagonista);
    }

    @Override
    @GetMapping(path = "{id}")
    public Protagonista findOne(Protagonista protagonista) {
        return this.protagonistaService.findOneById(protagonista.getId());
    }

    @Override
    @PutMapping
    public Protagonista update(@RequestBody Protagonista protagonista) {
        return this.protagonistaService.saveOrUpdate(protagonista);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Protagonista protagonista) {
        return this.protagonistaService.delete(protagonista.getId());
    }

}
