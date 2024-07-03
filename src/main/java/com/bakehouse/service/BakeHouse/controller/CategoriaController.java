package com.bakehouse.service.BakeHouse.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bakehouse.service.BakeHouse.model.Categoria;
import com.bakehouse.service.BakeHouse.service.api.CategoriaServiceAPI;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin("*")
public class CategoriaController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private CategoriaServiceAPI categoriaServiceAPI;

    @GetMapping(value = "/all")
    public List<Categoria> getAllDocuments() {
        LOG.info("Getting All Categorias.");
        ArrayList<Categoria> returnList = new ArrayList<>();
        this.categoriaServiceAPI.getAllDocuments().forEach(obj -> returnList.add(obj));
        return returnList;
    }

}