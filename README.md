Pour déployer l'application :

copier le lien du repository :

l'importer dans votre IDE

créer la base de données postgreSQL "bibliotheque" et y exécuter le script "bibli.sql"

Adapter les informations de la datasource dans le fichier application.properties du module microserviceBdd-web

Pour exécuter l'application :

Taper l'url : http://localhost:8080/home sur un navigateur Internet
Pour l'exécution du batch :

Planifier une tâche qui lancera chaque jour la commande: (en adaptant le chemin)

java -jar batchMail-business-0.0.1-SNAPSHOT.jar
