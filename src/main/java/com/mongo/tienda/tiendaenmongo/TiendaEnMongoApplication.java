package com.mongo.tienda.tiendaenmongo;

import com.mongo.tienda.tiendaenmongo.models.Orden;
import com.mongo.tienda.tiendaenmongo.repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TiendaEnMongoApplication implements CommandLineRunner {

	/**
	 * Objeto de orden Repository
	 */
	@Autowired
	OrdenRepository ordenRepository;

	/**
	 * Metodo estatico por el cual inicia el programa de spring
	 * @param args por defecto del main
	 */
	public static void main(String[] args) {
		SpringApplication.run(TiendaEnMongoApplication.class, args);
	}


	/**
	 * Se crean tres ordenes diferentes de prueba
	 * @param args por defecto de CommmandLineRunner
	 * @throws Exception por defecto de commandLineRunner
	 */
	@Override
	public void run(String... args) throws Exception {
		ordenRepository.save(new Orden("uno","calle NQS sur-54","Yes","450000","null","06"));
		ordenRepository.save(new Orden("dos","Palmira valle - barrio las mercedes","No","8500","8778-1","06"));
		ordenRepository.save(new Orden("tres","Medellin 124-87 - Edifiio Olaya Herrera","Yes","1000000.20","8889945-1","07"));
	}

}
