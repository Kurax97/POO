package io;

/**
 * The Class that manages the the position og cells
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class Position{

	// Attributes of the class Sea
	
    private int x;
    private int y;

    /** the constructor of the class Position with 2 parameters
     * @param x for the coordinate x
     * @param y for the coordinate y
     */
    public Position(int x, int y){
	this.x = x;
	this.y = y;
    }

    /** return the coordinate x
     * @return the coordinate x of this position
     */
    public int getX(){
	return this.x;
    }

    /** return the coordinate y
     * @return the coordinate y of this position
     */
    public int getY(){
	return this.y;
    }
    
    /** two position are equals if they have the same x and the same y
     * @param O the object to test equality with 
     * @return <code>true</code> if o is a position with the same x and the same y than this object
     */
    public boolean equals(Object O){
	if (!(O instanceof Position))
	    return false;
	Position other = (Position) O;
	return (this.y == other.y && this.x == other.x);
    }

    /**
     * @return a string description of this position 
     */
    public String toString(){
	return "My position is (" + this.x + ", "  + this.y + "), my X = " + this.x + " and my Y = " + this.y;
    }

}
