package org.sid.customerservice;

import org.sid.customerservice.Repository.CustomerRepository;
import org.sid.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class customerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(customerServiceApplication.class, args);
    }


   @Bean
   CommandLineRunner commandLineRunner (CustomerRepository customerRepository) {
      return args -> {
        Customer customer1 = Customer.builder()
                .nom("ikrame")
                .email("@gmail.com")
                .build();
        customerRepository.save(customer1);

          Customer customer2 = Customer.builder()
                  .nom("zak")
                  .email("@gmail.com")
                  .build();
          customerRepository.save(customer2);

          customerRepository.findAll().forEach(c-> {
              System.out.println("Customer " + c.getId() + " " + c.getNom() + " " + c.getEmail());
          });
     };
  }
}