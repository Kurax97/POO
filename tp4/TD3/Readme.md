- Binômes : Benlamlih Mohammed, Abdesselam Lyes

- Ce TP consiste à modiliser un calendrier (manipulation des dates)
	- Objectifs du TP: 
		1. Création des testes de java (Compilation et execution des testes java).
		2. Ecrire la documentation (java doc) et la générer.
		3. Création de A à Z les classes dont on a besoin.
		4. Utilisation de Enum.
		5. Utiliser les packages ansi que les fichier compressé JAR	
		4. Faire un petit project réalistique.
<br />
- On a tout réussi. Pour la fonction gap il y a deux versions, une en commantaire qui est probablement plus effectif que celle qu'on utilise mais il reste quelque petit problèmes à fixer, parcontre celle qui n'est pas en commentaire marche très bien. Dans cette fonction le jour d'arrivé n'est pas inclus.
<br />
- Pour la fonction compare on a considérer que l'année la plus grande c'est l'année "la plus veille" et non celle où il y a le plus d'année exemple: 12 novembre 2010 > 12 novembre 2013, pareil pour les mois février > mai.

- Pour générer la documentation de ce projet:
	1. Placer vous dans le fichier src/ qui se trouve dans à la racine du projet
	2. Tapez la commande: $ javadoc -d ../docs -subpackages date 

  Le paramètre -d permet de changer l'emplacement des fichier de documentation dans le fichiers docs qui se trouve à la racine du projet, le paramètre -subpackages pour génerer la documentation du package date ansi que tout les sous-packages.

- Pour consulter la documentation, on trouve dans le dossier docs des fichiers html qui contiennent la documentation

- Pour compiler les classes de ce projets:
	1. Placer vous dans le fichier src/ qui se trouve à la racine du projet
	2. Tapez la commande: $ javac date/Month.java -d ../classes (pour compiler Month.java)
	3. Tapez la commande: $ javac date/Date.java -d ../classes (pour compiler Date.java)
	4. Tapez la commande: $ javac date/DateMain.java -d ../classes (pour compiler DateMain.java)

- Pour compiler et executer les testes de ce projet :
	1. Placer vous dans à la racine du projet
	2. Assurez vous que vous avez bien compiler les fichiers Month.java et Date.java
	3. Tapez la commande: $ javac -classpath test-1.7.jar test/DateTest.java (compilation des testes)
	4. Ensuite tapez la commande: $ java -jar test-1.7.jar DateTest (execution des tests)

- Pour générer le fichier .jar:
	1. Compilez tous les fichers: Month.java, Date.java et DateMain.java
	2. Assurez que le fichier manifest-ex existe et que son contenu ressemble à: Main-Class: date.DateMain
	3. Placez vous dans le fichier classes/ (là où vous avez compiler vos fichiers)
	4. Tapez la commande: jar cvfm ../date.jar ../manifest-ex date

- Pour exécuter le programme il y a deux méthode avec le jar exécutable et sans jar exécutable:
	- Avec le jar exécutable:
		Tapez la commande: $ java -jar  date.jar
		- Si vous ne tapez aucun argument après la commande vous aurez des informations partique comme la date d'aujourd'hui et celle de demain ansi que dans combien de jour va etre mon anniversaire. 
		Exemple: 

				$ java -jar  date.jar 
				On est le 18 FEBRUARY 2020.
				Demain c'est le 19 FEBRUARY 2020
				On a les vancances dans 4 jours donc ça va etre le 22 FEBRUARY
				Je vais avoir 20ans dans 74 jours

		- Vous pouvez ajouter 3 arguments après la commande pour représenter votre date de naissance : premier argument (jour) de 1 à nombre de jours de votre mois de naissance, deuxième argument (mois) de 1 à 12 : 1 pour janvier, 2 pour février.. , troisième argument (année) > 0. Vous allez savoir combien de jour il reste a votre anniversaire.
		Exemple:

				$ java -jar  date.jar 22 2 1973
				Vous anniversaire aura lieu dans 4 jours et vous aurez 47 ans
				$ java -jar  date.jar 2 1 2004
				Votre anniversaire est déjà passé il y a 47 jours et vous avez 16 ans
	
	- Sans le jar exécutable:
		1. Placez vous dans le fichier classes/ (où vous avez compiler vos fichier)
		2. Tapez la commande: java date.DateMain
		- Si vous ne tapez aucun argument après la commande vous aurez des informations partique comme la date d'aujourd'hui et celle de demain ansi que dans combien de jour va etre mon anniversaire. 
		Exemple: 

				$ java date.DateMain
				On est le 18 FEBRUARY 2020.
				Demain c'est le 19 FEBRUARY 2020
				On a les vancances dans 4 jours donc ça va etre le 22 FEBRUARY
				Je vais avoir 20ans dans 74 jours

		- Vous pouvez ajouter 3 arguments après la commande pour représenter votre date de naissance : premier argument (jour) de 1 à nombre de jours de votre mois de naissance, deuxième argument (mois) de 1 à 12 : 1 pour janvier, 2 pour février.. , troisième argument (année) > 0. Vous allez savoir combien de jour il reste a votre anniversaire.
		Exemple:

				$ java date.DateMain 22 2 1973
				Vous anniversaire aura lieu dans 4 jours et vous aurez 47 ans
				$ java date.DateMain 2 1 2004
				Votre anniversaire est déjà passé il y a 47 jours et vous avez 16 ans

Fin.


