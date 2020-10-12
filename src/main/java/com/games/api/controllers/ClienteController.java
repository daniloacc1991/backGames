package com.games.api.controllers;

import com.games.api.common.constans.RouteConstant;
import com.games.api.common.core.CrudController;
import com.games.api.entities.Cliente;
import com.games.api.services.ClienteService;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(path = RouteConstant.BASE_URL + "clientes")
public class ClienteController implements CrudController<Cliente, Long> {

    @Autowired
    private ClienteService clienteService;

    @Override
    @GetMapping()
    public List<Cliente> findAll() {
        return (List<Cliente>) this.clienteService.findAll();
    }

    @Override
    @PostMapping
    public Cliente create(@Valid @RequestBody Cliente cliente, Errors errores) {
        return this.clienteService.saveOrUpdate(cliente);
    }

    @Override
    @GetMapping(path = "{id}")
    public Cliente findOne(Cliente cliente) {
        log.info("ID: " + cliente.getId());
        return this.clienteService.findOneById(cliente.getId());
    }

    @Override
    @PutMapping()
    public Cliente update(@RequestBody Cliente cliente) {
        return this.clienteService.saveOrUpdate(cliente);
    }

    @Override
    @DeleteMapping(path = "{id}")
    public Long delete(Cliente cliente) {
        return this.clienteService.delete(cliente.getId());
    }

}
