package pfc.strategy;

import pfc.Choice;

/**
 * The class that represents the Always Scissors strategy
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class AlwaysScissors implements Strategy{
	
	/** return a Choice, more specifically Choice.SCISSORS
	 * @return a Choice depending on the strategy, here Choice.SCISSORS
	 */
	public Choice select() {
		return Choice.SCISSORS;
	}
}
