package battleship;
import java.io.IOException;

import io.*;

/**
 * The Main class 
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class MainGame {
	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
		System.out.println("Veillez entrer 'S' pour jouler solo, contre l'ordi ou 'M' pour jouer à deux ");
		String jWay = Input.readString();
		if ((jWay.equals("S"))){
			Sea s1 = new Sea(10,10); // Create the board (Sea)
	    	Ship sh1 = new Ship(3);
	    	Ship sh2 = new Ship(6);
	    	Ship sh3 = new Ship(2);
	    	s1.addShipHorizontally(sh1, new Position(0,0));
	    	s1.addShipVertically(sh3, new Position(6,0));
	    	s1.addShipHorizontally(sh2, new Position(2,8));
	    	Game g1 = new Game(s1);
			g1.lancer(); // launch the game for the player
		}
		else if ((jWay.equals("M"))){
			System.out.println("Veuillez entrer une largeur pour le plateau de jeu");
	    	int h = Input.readInt();
	    	System.out.println("Veuillez entrer une hauteur pour le plateau de jeu");
	    	int w = Input.readInt();
	    	Sea s1 = new Sea(h,w); // Create the board (Sea)
	    	Sea s2 = new Sea(h,w); // Create the board (Sea)
	    	Game g1 = new Game(s1, s2);
	    	System.out.println("Combien de bateaux voulez vous mettre sur le plateau ?");
	    	int numberOfShip = Input.readInt();
	    	System.out.println("Quel est le nombre maximale de points dans le plateau?");
	    	int maxNumber = Input.readInt();
	    	System.out.println("Joueur 1 va commencer par entrer ses bateaux: ");
	    	g1.enterShips(numberOfShip, s1, maxNumber); // player 1 enter his ships
	    	System.out.println("Joueur 2 va maintenant entrer ses bateaux: ");
	    	g1.enterShips(numberOfShip, s2, maxNumber); // player 2 enter his ships
	    	g1.lanceForTwo(); // launch the game for the two players
	    	
		}
	}
}
