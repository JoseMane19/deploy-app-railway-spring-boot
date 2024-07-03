package com.bakehouse.service.BakeHouse.service.implement;

import com.bakehouse.service.BakeHouse.dao.CategoriaRepository;
import com.bakehouse.service.BakeHouse.model.Categoria;
import com.bakehouse.service.BakeHouse.service.api.CategoriaServiceAPI;
import com.bakehouse.service.BakeHouse.source.implement.ServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class CategoriaServiceImplement extends ServiceImplement<Categoria, String> implements CategoriaServiceAPI {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CrudRepository<Categoria, String> getDao() {
        return this.categoriaRepository;
    }

    @Override
    public MongoRepository<Categoria, String> getRepository() {
        return this.categoriaRepository;
    }
    
    
}
