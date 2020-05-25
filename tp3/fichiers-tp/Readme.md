- Binômes : Benlamlih Mohammed, Abdesselam Lyes

- Ce TP consiste à modiliser un projet réelle celui d'une station de vélos (V'Lille)
	Objectifs du TP: 
		1- Familiarisation avec les testes de java (Compilation et execution des testes java)
		2- Ecrire la documentation (java doc) et la générer
		3- Créer une classe java en respectant les testes java.
		4- Faire un petit project réalistique.

- Pour générer la documentation d'un fichier java, il suffit d'executer la commande "javadoc fichier.java -d docs" dans le terminal (il faut s'assurer qu'on est bien dans le dossier ou se trouve le fichier.java) 
- Pour consulter la documentation, on trouve dans le dossier docs des fichiers html qui contiennent la documentation

- Pour compiler les classes du projets il faut se rendre au dossier qui contient les fichiers .java et ensuite executer la commande: javac maClass.java, ce qui va nous permettre d'obtenir un fichier maClass.class

- Pour compiler les testes il faut d'abbord compiler le fichier (la class) qu'on veut tester (ex: javac maClass.java) ensuite compiler le fichier teste avec la commande: javac -classpath test-1.7.jar test/maClassTest.java (il faut avoir test-1.7.jar) et finalement executer le teste avec la commande: java -jar test-1.7.jar maClassTest 

- Pour compiler le programme (main) d'abord on execute la commande : javac maClassMain.java (toujours dans le dossier ou se trouve le fichier qu'on veut compiler) on obtient alors un fichier maClassMain.class ensuite il faut l'éxecuter avec la commande : java maClassMain args (si il y a des arguments: cela depend de la class maClassMain.java)

	Exemple : Compilation et execution de la classe BikeMain.java 

		$ javac BikeMain.java 	 #Compilation de la classe BikeMain.java
		$ java BikeMain 	#Execution de la classe BikeMain.java (on remarque que ici on a pas mis d'arguments)
		false
		bike id: b001, model : CLASSICAL
		10

	Exemple : Compilation et execution de la classe BikeStationMain.java

		$ javac BikeStationMain.java 	#Compilation de la classe BikeStationMain.java
		$ java BikeStationMain 1 	#Execution de la classe BikeStationMain.java (on remarque que ici on a ajouter un argument 1)
		Vous avez pris le vélo : b002. Le prix de location pour ce modèle est: 10€

	On ajoute l'argument 1 car dans le code de la classe on prend l'argument. ( c = station.takeBike(Integer.parseInt(args[0]));)

	Fin.


