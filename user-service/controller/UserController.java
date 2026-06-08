package com.Commande_de_Repas.user_service.controller;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/login")
    public Map<String, String> login() {
        String kongSecret = "RICrIcMjZw0LmYcvqRE9sksh2193cRGI";
        // La clé doit faire au moins 32 octets (256 bits) pour HS256
        Key key = Keys.hmacShaKeyFor(kongSecret.getBytes());

        String token = Jwts.builder()
                .setSubject("user_alice")
                .claim("role", "USER")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        Map<String, String> response = new HashMap<>();
        response.put("access_token", token);
        return response;
    }
}