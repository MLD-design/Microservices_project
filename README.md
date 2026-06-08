Projet : Système de Commande de Repas Microservices
Ce projet est une architecture de microservices construite avec Spring Boot et Spring Cloud, orchestrée par Kong API Gateway et utilisant Eureka pour la découverte de services.

Architecture du Système
Le système est composé de plusieurs services indépendants communiquant entre eux :

Service Eureka : Registre de services (Discovery Server).

Kong API Gateway : Passerelle d'API pour le routage des requêtes.

Order Service : Gère les commandes des utilisateurs.

Restaurant Service : Gère les restaurants et le catalogue de plats.

Notification Service : Gère l'envoi de notifications aux utilisateurs.

Technologies Utilisées
Java 17+ & Spring Boot 3

Spring Cloud (Eureka, OpenFeign)

Kong Gateway

Git (Versionnage)

Prérequis
JDK 17 ou supérieur installé.

Kong Gateway configuré et lancé.

Docker (recommandé pour Kong).

Lancement du Projet
1. Démarrer le Registre de Service
Bash
# Lancer le projet Eureka Server
2. Démarrer les Microservices
Lancez chaque service dans l'ordre :

restaurant-service (Port 8082)

order-service (Port 8083)

notification-service (Port 8084)

3. Configuration de Kong
Pour exposer les services via la passerelle, assurez-vous que les routes sont configurées :

/restaurants -> pointe vers restaurant-service

/commandes -> pointe vers order-service

/notifications -> pointe vers notification-service

🔗 Exemples de requêtes (API)
Passer une commande
Bash
curl -s -X POST http://localhost:8000/commandes/passer \
  -H "Content-Type: application/json" \
  -d "{\"plat\": \"Pizza Margherita\"}"
Envoyer une notification
Bash
curl -s -X POST http://localhost:8000/notifications/envoyer \
  -H "Content-Type: application/json" \
  -d "{\"destinataire\": \"Client\", \"message\": \"Commande confirmée !\"}"
Communication Inter-Services
Le système utilise OpenFeign pour permettre à l'Order Service d'interroger le Restaurant Service en temps réel afin de vérifier la disponibilité des plats avant de valider une commande.

Projet réalisé dans le cadre de l'apprentissage de l'architecture microservices.

