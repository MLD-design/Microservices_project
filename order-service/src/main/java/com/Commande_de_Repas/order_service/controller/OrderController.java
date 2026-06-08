package com.Commande_de_Repas.order_service.controller;

import com.Commande_de_Repas.order_service.client.RestaurantClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private RestaurantClient restaurantClient; // Injection du client Feign

    @PostMapping("/commandes")
    public String testCommande(@RequestBody String orderDetails) {
        // Logique : extraire le plat de orderDetails (ici, on suppose que vous passez le nom du plat)
        String plat = orderDetails; 
        
        // Appel au restaurant-service via Feign
        String resultat = restaurantClient.verifierPlat(plat);
        
        return "Commande reçue pour : " + plat + " | Résultat restaurant : " + resultat;
    }
}