package com.bakehouse.service.BakeHouse.dao;

import com.bakehouse.service.BakeHouse.model.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
    
}
