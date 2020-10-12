package com.games.api.controllers;

import com.games.api.common.core.CrudController;
import com.games.api.common.constans.RouteConstant;
import com.games.api.entities.Juego;
import com.games.api.services.JuegoService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "juegos")
public class JuegoController implements CrudController<Juego, Long> {

    @Autowired
    private JuegoService juegoService;

    @Override
    @GetMapping
    public List<Juego> findAll() {
        return this.juegoService.findAll();
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Juego create(@Valid @RequestBody Juego juego, Errors errores) {
        log.info("juego:" + juego);
        return this.juegoService.saveOrUpdate(juego);
    }

    @Override
    @GetMapping(path = "{id}")
    public Juego findOne(Juego juego) {
        return this.juegoService.findOneById(juego.getId());
    }

    @Override
    @PutMapping
    public Juego update(@Valid @RequestBody Juego juego) {
        return this.juegoService.saveOrUpdate(juego);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Juego juego) {
        return this.juegoService.delete(juego.getId());
    }

}
