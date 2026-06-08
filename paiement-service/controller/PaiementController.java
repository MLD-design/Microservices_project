package com.Commande_de_Repas.paiement_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paiements")
public class PaiementController {

    @PostMapping("/payer")
    public String traiterPaiement(@RequestBody String details) {
        // Logique de traitement de paiement
        return "SUCCESS - Paiement traité pour la commande : " + details;
    }
}