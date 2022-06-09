package com.mongo.tienda.tiendaenmongo.repositories;

import com.mongo.tienda.tiendaenmongo.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, String> {

    /**
     * Consulta utilizada para buscar por id
     * @param id tipo string el cual sera buscado
     * @return un objeto tipo orden
     */
    public Optional<Product> findById(String id);
}
