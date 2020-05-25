- Binômes : Benlamlih Mohammed, Abdesselam Lyes

- Ce TP consiste à créer une version du jeu Bataille Navale
	- Objectifs du TP: 
		1. Création des testes de java (Compilation et execution des testes java).
		2. Ecrire la documentation (java doc) et la générer.
		3. Création de A à Z les classes dont on a besoin.
		4. Utilisation de Enum.
		5. Utiliser les packages ansi que les fichier compressé JAR	
		4. Faire un petit jeu avec java.
<br />
- On a tout réussi. Pour la jeu il y a deux mode 'S' pour solo qui permet à l'utilisateur de jouer contre l'ordinateur et un mode 'M' pour multijoueur qui permet à  deux personnes de jouer l'un contre l'autre. Il y a beaucoup d'amélioration qu'on peut apporter a ce jeu comme la création d'un tableau de jeu au hasard contrairement à ce qu'on fait toujours les memes bateaux aux memes palces, ansi que l'implementation d'une interface graphique peut être pertinent.
<br />

- Pour générer la documentation de ce projet on peut le faire manuellement ou à l'aide d'un Makefile:
	1. Manuellement:
		- Placer vous dans le fichier src/ qui se trouve dans à la racine du projet
		- Tapez la commande pour générer la docmentation du package battleship: 
		```$ javadoc -d ../docs -subpackages battleship```
		- Tapez la commande pour générer la docmentation du package io: 
		```$ javadoc -d ../docs -subpackages io```
	2. A l'aide d'un Makefile (beaucoup plus facile):
		- Placer vous à la racine du projet
		- Tapez la commande :
		```$ make doc```

  Le paramètre -d utilisé dans la méthode manuelle permet de changer l'emplacement des fichier de documentation dans le fichiers docs qui se trouve à la racine du projet, le paramètre -subpackages pour génerer la documentation du package date ansi que tout les sous-packages.

- Pour consulter la documentation, on trouve dans le dossier docs des fichiers html qui contiennent la documentation

- Pour compiler les classes de ce projets:
	1. Manuellement:
		- Placer vous dans le fichier src/ qui se trouve à la racine du projet
		- Tapez la commande pour compiler la classe Ship: 
		```$ javac battleship/Ship.java  -d ../classes```
		- Tapez la commande pour compiler la classe Cell: 
		```$ javac battleship/Cell.java  -d ../classes```
		- Tapez la commande pour compiler la classe Sea: 
		```$ javac battleship/Sea.java  -d ../classes```
		- Tapez la commande pour compiler la classe Game: 
		```$ javac battleship/Game.java  -d ../classes```
		- Tapez la commande pour compiler la classe GameMain: 
		```$ javac battleship/GameMain.java  -d ../classes```
		- Tapez la commande pour compiler la classe Position: 
		```$ javac io/Position.java  -d ../classes```
		- Tapez la commande pour compiler la classe Answer: 
		```$ javac io/Answer.java  -d ../classes```
		- Tapez la commande pour compiler la classe Input: 
		```$ javac io/Input.java  -d ../classes```

	2. A l'aide d'un Makefile (beaucoup plus facile):
		- Placer vous à la racine du projet
		- Tapez la commande :
		```$ make```

- Pour compiler et executer les testes de ce projet :
	1. Manuellement:
		- Placer vous dans à la racine du projet
		- Assurez vous que vous avez bien compiler toutes les classes du projet. 
		- Compilation des testes:
			- Pour comiler le teste de la classe Cell tapez la commande:
			```$ javac -classpath test-1.7.jar test/CellTest.java```
			- Pour comiler le teste de la classe Ship tapez la commande:
			```$ javac -classpath test-1.7.jar test/ShipTest.java```
			- Pour comiler le teste de la classe Sea tapez la commande:
			```$ javac -classpath test-1.7.jar test/SeaTest.java```
			- Pour comiler le teste de la classe Position tapez la commande:
			```$ javac -classpath test-1.7.jar test/Position.java```
			- Pour comiler le teste de la classe Game tapez la commande:
			```$ javac -classpath test-1.7.jar test/GameTest.java```
		- Execution des testes:
			- Pour executer le teste de la Cell tapez la commande: 
			```$ java -jar test-1.7.jar CellTest```
			- Pour executer le teste de la Ship tapez la commande: 
			```$ java -jar test-1.7.jar ShipTest```
			- Pour executer le teste de la Sea tapez la commande: 
			```$ java -jar test-1.7.jar SeaTest```
			- Pour executer le teste de la Position tapez la commande: 
			```$ java -jar test-1.7.jar PositionTest```
			- Pour executer le teste de la Game tapez la commande: 
			```$ java -jar test-1.7.jar GameTest```

	2. A l'aide d'un Makefile (beaucoup plus facile):
		- Placer vous à la racine du projet
		- Il suffit de tapez la commande suivante et le teste sera compiler et executer:
		```$ make CellTest```
		- Pour tout les autres testes il suffit de remplacer CellTest par le teste desiré. 
		- Exemple : Pour compiler et executer le teste de la classe Sea on tape la commande: 
		```$ make SeaTest```

- Pour générer le fichier .jar:
	- Manuellement:
		1. Compilez toutes les classes du projet
		2. Assurez que le fichier manifest-ex existe et que son contenu ressemble à: Main-Class: battleship.MainGame
		3. Placez vous dans le fichier classes/ (là où vous avez compiler vos fichiers)
		4. Tapez la commande: ```$ jar cvfm ../battleship.jar ../manifest-ex battleship io```

	- A l'aide de Makefile:
		1. Compilez toutes les classes du projet
		2. Assurez que le fichier manifest-ex existe et que son contenu ressemble à: Main-Class: battleship.MainGame
		3. Placez vous à la racine du projet
		4. Tapez la commande: ```$ make jar```

- Pour exécuter le programme il y a deux méthode avec le jar exécutable et sans jar exécutable et pour chaque méthode il y a deux méthode, manuellement ou à l'aide du Makefile:
	- Avec le jar exécutable:
		- Manuellement:
			- Tapez la commande: ```$ java -jar  battleship.jar```

					$ java -jar  battleship.jar
					Veillez entrer 'S' pour jouler solo, contre l'ordi ou 'M' pour jouer à deux 

		- A l'aide du Makefile:
			- Tapez la commande: ```$ make playjar```

					$ make playjar
					Veillez entrer 'S' pour jouler solo, contre l'ordi ou 'M' pour jouer à deux 
	
	- Sans le jar exécutable:
		- Manuellement:
			1. Placez vous dans le fichier classes/ (où vous avez compiler vos fichier)
			2. Tapez la commande: ```$ java battleship.MainGame```

					$ java battleship.MainGame
					Veillez entrer 'S' pour jouler solo, contre l'ordi ou 'M' pour jouer à deux

		- A l'aide du Makefile:
			1. Placez à la racine du projet
			2. Tapez la commande ```$ make play```


Fin.


