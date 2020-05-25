package battleship;
import io.*;

/**
 * The Class that manages the cells where we place the ships
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */


public class Cell {
    
    // Attributes of the class Cell

    private Ship ship;
    private boolean shot;
    
    /** the constructor of the class Cell 
     */
    public Cell(){
	this.ship = null;
	this.shot = false;
	}
    
    /** add a ship to the cell and return nothing (void)
     * @param ship that we want to add to the cell
     */
    public void add(Ship ship){
	if (this.ship == null) // we do verify it on sea anyways
	    this.ship = ship;
	}
    
    /** return an answer: HIT if the cell is hit, MISSED if not and SUNK if it was the last cell of the ship witch was hit
     * @return HIT if the cell is hit, missed if not and SUNK if the ship is sunk
     */
    public Answer shot(){
    	Answer res = null;
		if (!this.shot && !(this.isEmpty())){
		    if(this.ship.getLifePoints() > 0){
			this.ship.decreaseLP();
			this.shot = true;
		        if(this.ship.getLifePoints() > 0)
			    res = Answer.HIT;
			else
			    // probably this.ship = null ? 
			    res = Answer.SUNK;
	
		    }
		}
		else
		    res = Answer.MISSED;
		return res;
    }
    
    /** return the actual ship in this cell, null if the cell is empty
     * @return the ship in this cell, null if the cell is empty
     */
    public Ship getShip(){
	if (this.ship != null)
	    return this.ship;
	else
	    return null;
    }
    
    /** return true if the cell doesn't contain a ship, false otherwise
     * @return true if the cell is empty, false otherwise
     */
    public boolean isEmpty(){
	if (this.ship == null)
	    return true;
	else
	    return false;
    }
    
    /** return true if the cell has already been shot, false otherwise
     * @return true if the cell has already been shot, false otherwise
     */
    public boolean hasBeenShot(){
	return this.shot;
    }

    /** return a String that describe the state of the cell: if it's empty or not and if it's already been shot
     * @param defender true if we're going to show the state of the cell to the defender false if we're going to show the state of the cell to the attacker
     * @return a String that describe the state of the cell: if it's empty or not and if it's already been shot
     */
    public String getCharacter(boolean defender){
    	String res = "";
	if (defender){
	    if(this.isEmpty())
	    	res = "~";
	    else if (this.shot)
	    	res = "*";
	    else
	    	res = "B";
	}
	else{
	    if(!(this.shot))
	    	res = ".";
	    else if (this.shot && this.isEmpty())
	    	res = "~";
	    else if (this.shot && !(this.isEmpty()))
	    	res = "*";
	}
	return res;
    }
} 

