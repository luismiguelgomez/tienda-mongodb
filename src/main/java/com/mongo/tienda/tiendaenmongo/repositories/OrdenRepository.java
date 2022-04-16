package com.mongo.tienda.tiendaenmongo.repositories;

import com.mongo.tienda.tiendaenmongo.models.Orden;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrdenRepository extends MongoRepository<Orden, String> {

    public Optional<Orden> findById(String id);
}
