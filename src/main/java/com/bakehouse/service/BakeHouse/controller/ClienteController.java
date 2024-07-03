package com.bakehouse.service.BakeHouse.controller;

import com.bakehouse.service.BakeHouse.model.Cliente;
import com.bakehouse.service.BakeHouse.service.api.ClienteServiceAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Cliente")
@CrossOrigin("*")
public class ClienteController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private ClienteServiceAPI clienteServiceAPI;
//
    @GetMapping(value = "/all")
    public List<Cliente> getAllDocuments(){

        log.info("OBTENER LISTADO DE TODOS LOS ELEMENTOS -- COLLECTION");
        ArrayList<Cliente> listaDocumentos = new ArrayList<>();
        this.clienteServiceAPI.getAllDocuments().forEach(obj -> listaDocumentos.add(obj));

        return listaDocumentos;
    }
}
