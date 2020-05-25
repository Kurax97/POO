package pfc;

import pfc.*;
import pfc.strategy.*;
import pfc.io.*;

/**
 * The Main class 
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class MainGame {

	public static void main(String[] args) {
		System.out.println("Veuillez Entrer le nom du jouer 1"); 
		String playerOneN = Input.readString(); // name of the first player
		System.out.println("Veuillez Entrer le nom du jouer 2");
		String playerTwoN = Input.readString(); // name of the second player
		// You can change the strategy here
        Player p1 = new Player(playerOneN, new Human()); // create the first player with the Human Strategy
		Player p2 = new Player(playerTwoN, new Human()); // create the first player with the Human Strategy
		Game g = new Game(p1, p2); // create the game
		System.out.println("Combien de partie voulez-vous jouer?");
		int nb = 0;
		try {
			nb = Input.readInt();
		}catch(Exception e) {
			System.out.println("Veillez entrez un entier");
		}
		
		g.play(nb);
		Object winner = g.Winner(); // determine the winner
		if (winner instanceof Player) { // check if the
			Player winnerName = (Player) winner; // 
			System.out.println(winnerName.getName() + " a gagné");
		}else {
			String text = (String) winner;
			System.out.println(text);
		}
	}

}
