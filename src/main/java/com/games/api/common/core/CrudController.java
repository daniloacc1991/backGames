/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.api.common.core;

import java.util.List;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author desarrollo
 * @param <T>
 * @param <ID>
 */
public interface CrudController<T extends Object, ID extends Object> {
    
    @GetMapping
    public List<T> findAll();
    
    @PostMapping
    public T create(T t, Errors e);
    
    @GetMapping(path = "{id}")
    public T findOne(T t);
    
    @PutMapping
    public T update(T t);
    
    @DeleteMapping(path = "{id}")
    public ID delete(T t);
}
