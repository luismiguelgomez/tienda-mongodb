package com.mongo.tienda.tiendaenmongo.repositories;

import com.mongo.tienda.tiendaenmongo.models.Orden;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrdenRepository extends MongoRepository<Orden, String> {

    /**
     * Consulta utilizada para buscar por id
     * @param id tipo string el cual sera buscado
     * @return un objeto tipo orden
     */
    public Optional<Orden> findById(String id);
}
