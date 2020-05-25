package pfc;

import pfc.strategy.Strategy;
/**
 * The Class that manages the player
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */
public class Player{
	
	// Attributes of the class Player
	
	private int nbPoints;
	private String name;
	private Strategy strategy;
	
	/** the constructor of the class Player with 2 parameters
     * @param name for the name of the player
     * @param strategy for the strategy that he is going to use
     */
	public Player(String name, Strategy strategy){
		this.nbPoints = 0;
		this.name = name;
		this.strategy = strategy;
	}
	
	
	/** return a Choice depending on the player's strategy
     * @return a Choice depending on the player's strategy
     */
	public Choice choose() {
		return this.strategy.select();
	}
	
	/** add n points to this (player) and returns nothing
     * @param n number of points to be added to the player
     */
	public void addPoints(int n) {
		this.nbPoints += n;
	}
	
	/** return the player's name
	 * @return the name of the player
	 */
	public String getName() {
		return this.name;
	}
	
	/** return the player's points
	 * @return the points of the player
	 */
	public int getPoints() {
		return this.nbPoints;
	}
	
	/**
     * @return a string description of this position 
     */

	public String toString() {
		return "The name of this player is " + this.name + " and they have " + this.nbPoints + " points.";
	}
}