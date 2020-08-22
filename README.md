Projet 7 : Système de gestion des bibliothèques d'une ville.

Ce projet multi-application(maven) a été réalisé en Java.

Utilisation:

 - Spring MVC
 - Spring security 
 - Spring Data JPA
 - Thymeleaf
 - microservice REST
 - Base de donnée: PostgreSQL 9.6.12

Prérequis : 

- Avoir installé votre JDK : Une procédure est indiquée sur ce lien : 
http://objis.com/tutoriel-java-installation-java-jdk-8/

- Avoir installé votre IDE : une procédure est indiquée sur ce lien : 
http://objis.com/tutoriel-spring-n1-installation-spring-ide/

- Avoir accès à une plate-forme d'administration et de développement pour la base de données PostgreSQL : Si vous n'en avez pas, je vous conseille pgAdmin : https://www.pgadmin.org/


Pour déployer l'application :

- Copier le lien du repository : https://github.com/superdevsteph/projet7.git

- L'importer dans votre IDE

- Créer la base de données postgreSQL "bibliotheque" et y exécuter le script "bibli.sql"

- Adapter les informations de la datasource dans le fichier application.properties du module microserviceBdd-web

Pour exécuter l'application :

- Effectuer un clic droit sur le module microserviceBdd-web > Run As > Spring Boot App
- Effectuer un clic droit sur le module ApplicationWebClient-web > Run As > Spring Boot App

Afin d'accéder à l'application sur notre navigateur Internet : 

- Taper l'url : http://localhost:8080/home

Pour l'exécution du batch :

- Planifier une tâche qui lancera chaque jour la commande (en adaptant le chemin) : 

java -jar batchMail-business-0.0.1-SNAPSHOT.jar# P7_vers_P10
# P7_vers_P10
# P7_to_P10
