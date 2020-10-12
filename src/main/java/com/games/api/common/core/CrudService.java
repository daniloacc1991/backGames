/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.api.common.core;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;

/**
 *
 * @author desarrollo
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T extends Object, ID extends Object> {
    
    public List<T> findAll();
    
    public T saveOrUpdate(T t);
    
    public ID delete(ID id);
    
    public T findOneById(ID id);

}
