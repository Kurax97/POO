- Binômes : Benlamlih Mohammed, Abdesselam Lyes

- Ce TP consiste à créer une version du jeu Bataille Navale
	- Objectifs du TP: 
		1. Utilisation des interfaces
		2. Faire un petit jeu avec java.
<br />
- On a tout réussi. Dans le main on a utiliser les strategies Human, qui donnent le choix au joueur de choisir son coup, il suffit de changer dans le main la strategie qu'on veut utiliser.
<br />

- Pour générer la documentation de ce projet:
	1. Placer vous dans le fichier src/ qui se trouve dans à la racine du projet
	2. Tapez la commande pour générer la docmentation: 
	```$ javadoc -d ../docs -subpackages pfc```

  Le paramètre -d utilisé dans la méthode manuelle permet de changer l'emplacement des fichier de documentation dans le fichiers docs qui se trouve à la racine du projet, le paramètre -subpackages pour génerer la documentation du package date ansi que tout les sous-packages.

- Pour consulter la documentation, on trouve dans le dossier docs des fichiers html qui contiennent la documentation

- Pour compiler les classes de ce projets:
	1. Placer vous dans le fichier src/ qui se trouve à la racine du projet
	2. Tapez la commandes suivantes:
		- Pour compiler la classe Choice: 
		```$ javac pfc/Choice.java  -d ../classes```
		- Pour compiler la classe Game: 
		```$ javac pfc/Game.java  -d ../classes```
		- Pour compiler la classe Player: 
		```$ javac pfc/Player.java  -d ../classes```
		- Pour compiler la classe MainGame: 
		```$ javac pfc/MainGame.java  -d ../classes```
		- Pour compiler la classe Input: 
		```$ javac pfc/io/Input.java  -d ../classes```
		- Pour compiler la classe Strategy: 
		```$ javac pfc/strategy/Strategy.java  -d ../classes```
		- Pour compiler la classe AlwaysPaper: 
		```$ javac pfc/strategy/AlwaysPaper.java  -d ../classes```
		- Pour compiler la classe AlwaysRock: 
		```$ javac pfc/strategy/AlwaysRock.java  -d ../classes```
		- Pour compiler la classe AlwaysScissors: 
		```$ javac pfc/strategy/AlwaysScissors.java  -d ../classes```
		- Pour compiler la classe Human: 
		```$ javac pfc/strategy/Human.java  -d ../classes```


- Pour compiler et executer les testes de ce projet :
	1. Placer vous dans à la racine du projet
	2. Assurez vous que vous avez bien compiler toutes les classes du projet. 
	3. Compilation des testes:
		- Pour comiler le teste de la classe Choice tapez la commande:
		```$ javac -classpath test-1.7.jar test/ChoiceTest.java```
		- Pour comiler le teste de la classe Game tapez la commande:
		```$ javac -classpath test-1.7.jar test/GameTest.java```
		- Pour comiler le teste de la classe Player tapez la commande:
		```$ javac -classpath test-1.7.jar test/PlayerTest.java```

	4. Execution des testes:
		- Pour executer le teste de la Choice tapez la commande: 
		```$ java -jar test-1.7.jar ChoiceTest```
		- Pour executer le teste de la Game tapez la commande: 
		```$ java -jar test-1.7.jar GameTest```
		- Pour executer le teste de la Player tapez la commande: 
		```$ java -jar test-1.7.jar PlayerTest```


- Pour générer le fichier .jar:

	1. Compilez toutes les classes du projet
	2. Assurez que le fichier manifest-ex existe et que son contenu ressemble à: Main-Class: pfc.MainGame
	3. Placez vous dans le fichier classes/ (là où vous avez compiler vos fichiers)
	4. Tapez la commande: ```$ jar cvfm ../Game.jar ../manifest-ex pfc```


- Pour exécuter le programme il y a deux méthode avec le jar exécutable et sans jar exécutable 
	- Avec le jar exécutable:
		- Tapez la commande: ```$ java -jar  Game.jar```

					$ java -jar  Game.jar
					Veuillez Entrer le nom du jouer 1

	- Sans le jar exécutable:
		1. Placez vous dans le fichier classes/ (où vous avez compiler vos fichier)
		2. Tapez la commande: ```$ java pfc.MainGame```

					$ java pfc.MainGame
					Veuillez Entrer le nom du jouer 1



Fin.


