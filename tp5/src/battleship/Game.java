package battleship;
import java.io.IOException;
/**
 * The Class that manages the start of the game
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

import io.*;

public class Game {
	
	// Attributes of the class Sea
	
	private Sea sea;
	private Sea sea2;
	
	/** the constructor of the class Game with 1 parameter
     * @param ourSea the sea of the game
     */
    public Game(Sea ourSea){
    	this.sea = ourSea;
    }
    
    /** the constructor of the class Game with 2 parameters
     * @param sea the sea of the first player
     * @param sea2 the sea of the second player
     */
    public Game(Sea sea, Sea sea2){
    	this.sea = sea;
    	this.sea2 = sea2;
    }
    
    
    public Sea getSea1() {
    	return this.sea;
    }
    public Sea getSea2() {
    	if (this.sea2 != null)
    		return this.sea2;
    	return null;
    }
    
    /** Launch the game for one player
     * @exception java.io.IOException if input does not correspond to an int
     */
    public void lancer() throws IOException {
    	System.out.println("La partie va commencer !");
    	System.out.println("Pour tirer sur il suffit d'enter une coordonnée x et ensuite une coordonnée y");
    	while(sea.getLifePointsOnBoard() > 0) {
    		sea.display(false);
    		System.out.println("Entrez une coordonnée x: ");
    		int x = Input.readInt();
    		System.out.println("Entrez une coordonnée y: ");
    		int y = Input.readInt();
    		try {
    		System.out.println(sea.shoot(new Position(x, y)));
    		}catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("Something went wrong.");
    		}
    	}
    	System.out.println("This is the end :(, You won! :)");
    }
    
    /** Launch the game for two players
     * @exception java.io.IOException if input does not correspond to an int
     */
    public void lanceForTwo() throws IOException {
    	System.out.println("La partie va commencer !");
    	System.out.println("Pour tirer sur il suffit d'enter une coordonnée x et ensuite une coordonnée y");
    	while(sea.getLifePointsOnBoard() > 0 && sea2.getLifePointsOnBoard() > 0) {
    		//Player 1's turn
    		System.out.println("Le joueur 1 va tirer");
    		System.out.println("Ton plateau");
    		sea.display(true);
    		System.out.println("Le plateau du joueur 2");
    		sea2.display(false);
    		System.out.println("Entrez une coordonnée x: ");
    		int x = Input.readInt(); // read x
    		System.out.println("Entrez une coordonnée y: ");
    		int y = Input.readInt(); // read y
    		try {
    		System.out.println(sea2.shoot(new Position(x, y))); // shoot the sea 2 (sea of the second player)
    		}catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("Something went wrong.");
    		}
    		//Player 2's turn
    		System.out.println("Le joueur 2 va tirer");
    		System.out.println("Ton plateau");
    		sea2.display(true);
    		System.out.println("Le plateau du joueur 1");
    		sea.display(false);
    		System.out.println("Entrez une coordonnée x: ");
    		int x1 = Input.readInt(); // read x1 
    		System.out.println("Entrez une coordonnée y: ");
    		int y1 = Input.readInt(); // read y1
    		try {
    		System.out.println(sea.shoot(new Position(x1, y1))); // shoot sea 1 (sea of the first player)
    		}catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("Something went wrong.");
    		}
    	}
    	if(sea.getLifePointsOnBoard() > sea2.getLifePointsOnBoard())
    		System.out.println("Joueur 1 a gagné");
    	else if (sea.getLifePointsOnBoard() < sea2.getLifePointsOnBoard())
    		System.out.println("Joueur 2 a gagné");
    	else
    		System.out.println("Egalité");
    }
    
    /** Allow to the two player to place the ships
     * @exception java.io.IOException if input does not correspond to an int
     * @exception ArrayIndexOutOfBoundsException if position not valid
     * @param numberOfShip number of ships that they want
     * @param sea the sea where we want to place the ships
     * @param maxNumber the maximum of life points that we ant on board
     */
    public void enterShips(int numberOfShip, Sea sea, int maxNumber) throws IOException, ArrayIndexOutOfBoundsException{
    	for (int i = 0; i < numberOfShip; i++) { // add ships player 1
    		if (sea.getLifePointsOnBoard() < maxNumber) {
	    		System.out.println("Veuillez entrer Le nombre de vie du bateau");
	    		int lP = Input.readInt();
	    		System.out.println("Veuillez la position où vous voulez placer votre bateau");
	    		System.out.println("Commencez par entrer la longitude X: ");
	    		int x = Input.readInt();
	    		System.out.println("Maintenant entrez la latitude Y: ");
	    		int y = Input.readInt();
	    		System.out.println("Veuillez entrer 'V' pour placer un bateau vertcalement ou 'H' pour le placer horizontalement");
	    		String dir = Input.readString();
	    		if ((dir.equals("V"))){
	    			sea.addShipVertically(new Ship(lP), new Position(x,y)); // Going to check if the position is valid and empty
	    		}
	    		else if ((dir.equals("H"))){
	    			sea.addShipHorizontally(new Ship(lP), new Position(x,y));
	    		}
	    	else {
	    		System.out.println("Vous avez atteint le nombre maximum de points de vie sur le plateau");
	    	}
    	}
    	}
    }
    
    



}
