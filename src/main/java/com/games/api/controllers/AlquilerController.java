package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import com.games.api.common.core.CrudController;
import com.games.api.entities.Alquiler;
import com.games.api.services.AlquilerService;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "alquileres")
public class AlquilerController implements CrudController<Alquiler, Long> {

    @Autowired
    private AlquilerService alquilerSerice;

    @Override
    @GetMapping()
    public List<Alquiler> findAll() {
        return this.alquilerSerice.findAll();
    }

    @Override
    @PostMapping
    public Alquiler create(@Valid @RequestBody Alquiler alquiler, Errors errores) {
        return this.alquilerSerice.saveOrUpdate(alquiler);
    }

    @Override
    @GetMapping(path = "{id}")
    public Alquiler findOne(Alquiler alquiler) {
        return this.alquilerSerice.findOneById(alquiler.getId());
    }

    @Override
    @PutMapping
    public Alquiler update(@RequestBody Alquiler alquiler) {
        return this.alquilerSerice.saveOrUpdate(alquiler);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Alquiler alquiler) {
        return this.alquilerSerice.delete(alquiler.getId());
    }

}
