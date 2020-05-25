package battleship;

/**
 * The Class that manages the ships
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class Ship {

    // Attributes of the class Ship

    private int lifePoints;
    private int sLength;


    /** the constructor of the class Ship with 1 parameter
    * @param length the initial length of the ship
    */
    public Ship(int length){
	this.sLength = length;
	this.lifePoints = length;
    }

    /** return the actual life points of the ship
    * @return the ship's life points
    */
    public int getLifePoints(){
	return this.lifePoints;
    }

    public void decreaseLP(){
	this.lifePoints -= 1;
    }

    /** return the length of the ship 
    * @return the ship's length
    */
    public int getLength(){
	return this.sLength;
    }
	
    /** return true if the life points of the ship = 0, false otherwise
    * @return true if the ship's life points = 0, false otherwise
    */
    public boolean isSunk(){
	return (this.lifePoints == 0);
    }

}
