package pfc.strategy;

import pfc.Choice;

/**
 * The class that represents the Always Rock strategy
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class AlwaysRock implements Strategy{
	
	/** return a Choice, more specifically Choice.ROCK
	 * @return a Choice depending on the strategy, here Choice.ROCK
	 */
	public Choice select() {
		return Choice.ROCK;
	}
}
