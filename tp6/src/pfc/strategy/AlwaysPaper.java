package pfc.strategy;

import pfc.Choice;

/**
 * The class that represents the Always Paper strategy
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class AlwaysPaper implements Strategy{
	
	/** return a Choice, more specifically Choice.PAPER
	 * @return a Choice depending on the strategy, here Choice.PAPER
	 */
	public Choice select() {
		return Choice.PAPER;
	}
}
