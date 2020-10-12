package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import com.games.api.common.core.CrudController;
import com.games.api.entities.Tecnologia;
import com.games.api.services.TecnologiaService;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "tecnologias")
public class TecnologiaController implements CrudController<Tecnologia, Long>{

    @Autowired
    private TecnologiaService tecnologiaService;

    @Override
    @GetMapping
    public List<Tecnologia> findAll() {
        return this.tecnologiaService.findAll();
    }

    @Override
    @PostMapping
    public Tecnologia create(@Valid @RequestBody Tecnologia tecnologia, Errors errores) {
        return this.tecnologiaService.saveOrUpdate(tecnologia);
    }

    @Override
    @GetMapping(path = "{id}")
    public Tecnologia findOne(Tecnologia tecnologia) {
        return this.tecnologiaService.findOneById(tecnologia.getId());
    }

    @Override
    @PutMapping
    public Tecnologia update(@RequestBody Tecnologia tecnologia) {
        return this.tecnologiaService.saveOrUpdate(tecnologia);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Tecnologia tecnologia) {
        return this.tecnologiaService.delete(tecnologia.getId());
    }
    
}
