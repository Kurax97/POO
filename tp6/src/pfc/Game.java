package pfc;
import java.util.ArrayList;
import java.util.List;


/**
 * The Class that manages the game
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */
public class Game{
	
	// Attributes of the class Player
	
	private Player player1;
	private Player player2;
	
	/** the constructor of the class Game with 2 parameters
     * @param player1 for the first player
     * @param player2 for the second player
     */
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	/** start a round and returns nothing
     */
	public void playOneRound() {
		Choice c1 = this.player1.choose();
		Choice c2 = this.player2.choose();
        int res = 0; 
		res = c1.compare(c2);
		if (res < 0)
			this.player2.addPoints(2);
		else if(res > 0)
			this.player1.addPoints(2);
		else {
			this.player1.addPoints(1);
			this.player2.addPoints(1);
		}
		res = 0;
	}
	
	/** play the game n times and returns the winner of the game, or a String if it's a draw game
     * @param round the number of rounds that wse want
     * @return the winner of the game, or a string if it's a draw game
     */
	public Object play(int round){
		for (int i = 0; i < round; i++){
			playOneRound();
            System.out.println("p1: " + this.player1.getPoints());
            System.out.println("p2: " + this.player2.getPoints());
        }
            
		return Winner();
		
	}	
	
	/** determine the winner and return the Player, or returns a String if there is no winner
     * @return the winner of the game, or a string if it's a draw game
     */
	public Object Winner() {
		List<Object> outputPossible = new ArrayList<>(); 
		outputPossible.add(this.player1);
		outputPossible.add(this.player2);
		outputPossible.add("Match null");
		if (this.player1.getPoints() < this.player2.getPoints())
			return outputPossible.get(1);
		else if (this.player2.getPoints() < this.player1.getPoints())
			return outputPossible.get(0);
		return outputPossible.get(2);
	}
}
