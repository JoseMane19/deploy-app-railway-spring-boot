package com.bakehouse.service.BakeHouse.dao;

import com.bakehouse.service.BakeHouse.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
