package org.sid.inventoryservice;

import org.sid.inventoryservice.Repository.ProductRepository;
import org.sid.inventoryservice.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    CommandLineRunner commandLineRunner (ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("PC").price(6000).quantity(10).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Tel").price(3000).quantity(10).build());

            productRepository.findAll().forEach(c -> System.out.println(c.toString()));


        };
    }

}
