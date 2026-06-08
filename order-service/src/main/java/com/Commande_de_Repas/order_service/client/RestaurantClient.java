package com.Commande_de_Repas.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// "restaurant-service" doit correspondre au nom défini dans son application.yml
@FeignClient(name = "restaurant-service")
public interface RestaurantClient {
    @GetMapping("/restaurants/plats/{nomPlat}")
    String verifierPlat(@PathVariable("nomPlat") String nomPlat);
}