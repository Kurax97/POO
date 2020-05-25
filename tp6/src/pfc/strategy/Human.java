package pfc.strategy;

import pfc.Choice;
import pfc.io.*;

/**
 * The class that represents the Human strategy
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class Human implements Strategy{

	/** return a Choice depending on the user's input
	 * @return a Choice depending on the user's input
	 */
	public Choice select() {
        Choice res = Choice.ROCK;
		System.out.println("Entrer 'P' pour pierre, 'F' pour feuille ou 'C' pour ciseaux");
		String hc = Input.readString();
		if (hc.equals("P") || hc.equals("p")){
		    res = Choice.ROCK;
        }
		else if (hc.equals("F") || hc.equals("f")){
			res = Choice.PAPER;
        }
		else if (hc.equals("C") || hc.equals("c")){
			res = Choice.SCISSORS;
        }
        return res;
	}
}
