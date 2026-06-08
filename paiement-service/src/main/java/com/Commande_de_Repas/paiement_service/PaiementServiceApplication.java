package com.Commande_de_Repas.paiement_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient // Indispensable pour être visible par Eureka
public class PaiementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaiementServiceApplication.class, args);
	}

}
