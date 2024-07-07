package com.bakehouse.service.BakeHouse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Saludo")
@CrossOrigin("*")
public class SaludoController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/Dime")
    public List<Object> dime(){
        log.info("OBTENER LISTADO DE TODOS LOS ELEMENTOS -- COLLECTION");
        ArrayList<Object> listaDocumentos = new ArrayList<>();
        listaDocumentos.add(0, "Hola mundo");

        return listaDocumentos;
    }
}
