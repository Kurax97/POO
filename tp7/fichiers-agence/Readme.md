- Binômes : Benlamlih Mohammed, Abdesselam Lyes

- Ce TP consiste à modéliser une agence de location de véhicule
	- Objectifs du TP: 
		1. Utilisation des interfaces et de l'héritage.
		2. Réalisation un projet réalistique.
<br />
- On a tout réussi. Pour la question 3.1, il failleit definir une fontion equals ansi que hashcode. Pour la question 7, on surcharger la méthode rentVehicule. Mais cela ne va pas changer les prix pour filter si on a un client qui a mois de 25 ans, donc c'est pas très pratique mais c'était pas demandé. 
<br />

- Pour générer la documentation de ce projet:
	1. Placer vous dans le fichier src/ qui se trouve dans à la racine du projet
	2. Tapez la commande pour générer la docmentation: 
	```$ javadoc -d ../docs -subpackages rental```

  Le paramètre -d utilisé dans la méthode manuelle permet de changer l'emplacement des fichier de documentation dans le fichiers docs qui se trouve à la racine du projet, le paramètre -subpackages pour génerer la documentation du package date ansi que tout les sous-packages.

- Pour consulter la documentation, on trouve dans le dossier docs des fichiers html qui contiennent la documentation

- Pour compiler les classes de ce projets:
	1. Placer vous dans le fichier src/ qui se trouve à la racine du projet
	2. Tapez la commande suivante:
		```$ javac rental/*.java  -d ../classes```


- Pour compiler et executer les testes de ce projet :
	1. Placer vous dans à la racine du projet
	2. Assurez vous que vous avez bien compiler toutes les classes du projet. 
	3. Tapez la commande:
		```$ javac -classpath test-1.7.jar test/rental/*.java```

	4. Execution des testes:
		- Pour executer le teste de la classe BrandFilter tapez la commande: 
		```$ java -jar test-1.7.jar rental.BrandFilterTest```
		- Pour executer le teste de la classe Car tapez la commande: 
		```$ java -jar test-1.7.jar rental.CarTest```
		- Pour executer le teste de la Classe Client tapez la commande: 
		```$ java -jar test-1.7.jar rental.ClientTest```
		- Pour executer le teste de la class MaxPriceFilter tapez la commande: 
		```$ java -jar test-1.7.jar rental.MaxPriceFilterTest```
		- Pour executer le teste de la class Motorbike tapez la commande: 
		```$ java -jar test-1.7.jar rental.MotorbikeTest```
		- Pour executer le teste de la class RentalAgency tapez la commande: 
		```$ java -jar test-1.7.jar rental.RentalAgencyTest```
		- Pour executer le teste de la class SuspiciousRentalAgency tapez la commande: 
		```$ java -jar test-1.7.jar rental.SuspiciousRentalAgencyTest```
		- Pour executer le teste de la class Vehicle tapez la commande: 
		```$ java -jar test-1.7.jar rental.VehicleTest```
		


- Pour générer le fichier .jar:

	1. Compilez toutes les classes du projet
	2. Assurez que le fichier manifest-ex existe et que son contenu ressemble à: Main-Class: rental.MainRentalAgency
	3. Placez vous dans le fichier classes/ (là où vous avez compiler vos fichiers)
	4. Tapez la commande: ```$ jar cvfm ../RentalAgency.jar ../manifest-ex rental```


- Pour exécuter le programme il y a deux méthode avec le jar exécutable et sans jar exécutable 
	- Avec le jar exécutable:
		- Tapez la commande: ```$ java -jar RentalAgency.jar```

					$ java -jar RentalAgency.jar		
					2012 brand1 60.0
					2015 brand1 50.0
					Vehicles for under 180$ :
					2015 brand1 100.0
					2012 brand1 60.0
					2015 brand1 50.0
					2018 Ford 100.0 5
					2006 Yamaha 160.0 600
					Unavailble vehicle
					100.0
					This client has already rented a vehicle
					60.0
					250.0
					200.0
					[2017 Kawazaki 200.0 800, 2016 Ford 250.0 4, 2015 brand1 100.0, 2012 brand1 60.0]
					2006 Yamaha 160.0 600
					2018 Ford 100.0 5
					Suspicious agency renting the same vehicule to two people with diffrent age
					160.0
					176.0


	- Sans le jar exécutable:
		1. Placez vous dans le fichier classes/ (où vous avez compiler vos fichier)
		2. Tapez la commande: ```$ java rental.MainRentalAgency```

					$ java rental.MainRentalAgency
					2012 brand1 60.0
					2015 brand1 50.0
					Vehicles for under 180$ :
					2015 brand1 100.0
					2012 brand1 60.0
					2015 brand1 50.0
					2018 Ford 100.0 5
					2006 Yamaha 160.0 600
					Unavailble vehicle
					100.0
					This client has already rented a vehicle
					60.0
					250.0
					200.0
					[2017 Kawazaki 200.0 800, 2016 Ford 250.0 4, 2015 brand1 100.0, 2012 brand1 60.0]
					2006 Yamaha 160.0 600
					2018 Ford 100.0 5
					Suspicious agency renting the same vehicule to two people with diffrent age
					160.0
					176.0



Fin.


