package pfc.strategy;

import pfc.*;

/**
 * Interface class that has the following methods.
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public interface Strategy {
	/** return a Choice depending on the strategy selected
	 * @return a choice depending on the strategy selected
	 */
	public Choice select();
}
