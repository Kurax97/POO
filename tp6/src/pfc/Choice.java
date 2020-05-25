package pfc;

import java.util.Random;

/**
 * The different type of plays that can be played
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

/**
 *  Playes that can be used to play the game
 */


public enum Choice{
	ROCK, PAPER, SCISSORS;
	
	
	public Choice randomChoice() {
		Random alea = new Random();
		int res = alea.nextInt(3);
		return Choice.values()[res];
			
	}
	
	/** return an integer 0 if this and c are the same 1 if this greather than c or -1 if c greather tha this
	 * @param c and other choice that we want to compare to this choice
	 * @return an integer 0 if this and c are the same 1 if this greather tha c or -1 if c greather tha this
	 */
	public int compare(Choice c) {
		int res = 0;
		if (this.ordinal() ==  c.ordinal())
			res = 0;
		else {
			if (this.ordinal() == 0 &&  c.ordinal() == 1)
				res = -1;
			else if (this.ordinal() == 1 &&  c.ordinal() == 2)
				res = -1;
			else if (this.ordinal() == 0 &&  c.ordinal() == 2)
				res = 1;
			else if (this.ordinal() == 1 && c.ordinal() == 0)
				res = 1;
			else if (this.ordinal() == 2 && c.ordinal() == 1)
				res = 1;
			else if (this.ordinal() == 2 &&  c.ordinal() == 0)
				res = -1;
		}
		return res;
	}

}

