package com.Commande_de_Repas.notification_service.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping("/envoyer")
    public String envoyerNotification(@RequestBody Map<String, String> payload) {
        String message = payload.get("message");
        String utilisateur = payload.get("destinataire");
        
        // Ici, vous pourriez appeler un service mail ou un service de messagerie
        System.out.println("Envoi d'une notification à " + utilisateur + " : " + message);
        
        return "SUCCESS - Notification envoyée à " + utilisateur;
    }
}