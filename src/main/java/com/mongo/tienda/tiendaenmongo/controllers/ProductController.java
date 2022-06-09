package com.mongo.tienda.tiendaenmongo.controllers;

import com.mongo.tienda.tiendaenmongo.models.Product;
import com.mongo.tienda.tiendaenmongo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orden")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getAllOrders(){
        return productRepository.findAll();
    }
}
