package com.games.api.services;

import com.games.api.common.core.CrudService;
import com.games.api.dao.ClienteDao;
import com.games.api.entities.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements CrudService<Cliente, Long> {
    
    @Autowired
    private ClienteDao clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente saveOrUpdate(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Long delete(Long id) {
        this.clienteRepository.deleteById(id);
        return id;
    }

    @Override
    public Cliente findOneById(Long id) {
        return this.clienteRepository.findById(id).orElse(null);
    }


}
