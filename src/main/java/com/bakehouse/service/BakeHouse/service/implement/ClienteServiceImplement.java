package com.bakehouse.service.BakeHouse.service.implement;

import com.bakehouse.service.BakeHouse.dao.ClienteRepository;
import com.bakehouse.service.BakeHouse.model.Cliente;
import com.bakehouse.service.BakeHouse.service.api.CategoriaServiceAPI;
import com.bakehouse.service.BakeHouse.service.api.ClienteServiceAPI;
import com.bakehouse.service.BakeHouse.source.implement.ServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImplement extends ServiceImplement<Cliente, String> implements ClienteServiceAPI {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public CrudRepository<Cliente, String> getDao() {
        return this.clienteRepository;
    }

    @Override
    public MongoRepository<Cliente, String> getRepository() {
        return this.clienteRepository;
    }
    
    
}
