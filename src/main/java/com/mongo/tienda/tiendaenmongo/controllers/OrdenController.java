package com.mongo.tienda.tiendaenmongo.controllers;

import com.mongo.tienda.tiendaenmongo.models.Orden;
import com.mongo.tienda.tiendaenmongo.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orden")
public class OrdenController {

    @Autowired
    OrdenRepository ordenRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Orden> getAllOrders(){
        return ordenRepository.findAll();
    }
}
