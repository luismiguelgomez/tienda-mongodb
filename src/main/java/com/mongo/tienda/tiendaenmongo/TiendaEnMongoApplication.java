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

	@Autowired
	OrdenRepository ordenRepository;

	public static void main(String[] args) {
		SpringApplication.run(TiendaEnMongoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ordenRepository.save(new Orden("uno","calle NQS sur-54","Yes","450000","null","06"));

		for (Orden orden : ordenRepository.findAll()) {
			System.out.println("orden:"+orden);
		}
	}

}
