package com.mongo.tienda.tiendaenmongo;

import com.mongo.tienda.tiendaenmongo.models.Product;
import com.mongo.tienda.tiendaenmongo.repositories.ProductRepository;
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
	ProductRepository ordenRepository;

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
		ordenRepository.save(new Product("uno", "Pulsar ns 200", "Pulsar 200 tipo carburador, frenos de disco adelante y atras", "10000000", "70"));
		ordenRepository.save(new Product("dos", "Dominar 400", "Pulsar 400 full inyection para ahorro de gasolina, freno delantero ABS, luz led, llantas pirelli diablo roso 3", "17580000", "3"));
		ordenRepository.save(new Product("tres", "Pulsar 180", "Pulsar 180 full inyection color plata, freno delantero ABS, luz led, llantas pirelli diablo roso 3", "8000000", "30"));
	}

}
