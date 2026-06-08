package com.Commande_de_Repas.restaurant_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Ajout de exclude ici, c'est plus efficace que dans le YAML
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RestaurantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}