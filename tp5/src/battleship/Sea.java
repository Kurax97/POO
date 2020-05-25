package battleship;
import io.*;

/**
 * The Class that manages the the sea where we have all the cells
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */

public class Sea {
    
	// Attributes of the class Sea
	
    private Cell[][] board;
    private int lifePointsOnBoard;
    
    /** the constructor of the class Sea with 2 parameters
     * @param width for the width of the board
     * @param height for the height of the board
     */
    public Sea(int width, int height){
	this.board = new Cell [height][width];
	for (int y = 0; y < height; y++){
	    for (int x = 0; x < width; x++)
	    	this.board[y][x] = new Cell();
	}
	this.lifePointsOnBoard  = 0;
    }

    /** return an Answer depending on whether if hit the cell, we missed or the ship is sunk
     * @param P the position of the cell that we want to shoot
     * @return an Answer depending on whether if hit the cell, we missed or the ship is sunk
     * @exception ArrayIndexOutOfBoundsException if the position is not valid 
     */
    public Answer shoot(Position P) throws ArrayIndexOutOfBoundsException {
	 if (!(this.validPosition(P)))
	     throw new ArrayIndexOutOfBoundsException("Invalid Position");
	 else{
		 Answer rep = getCell(P).shot(); 
		 if (rep == Answer.HIT || rep == Answer.SUNK)
			 this.lifePointsOnBoard -= 1;
	     return rep;
	 }
    }
    
    /** return the cell on the position P
     * @param P the position of the cell that we want to get
     * @return the cell on the position P
     */
    public Cell getCell(Position P){
	// we assume that the position is valid?
	if (!(this.validPosition(P)))
	     throw new ArrayIndexOutOfBoundsException("Invalid Position");
	else
	    return this.board[P.getY()][P.getX()];
    }

    /** return true if the Position P is valid, false otherwise
     * @param P the position that we want to check whether it is valid or not
     * @return true if the Position P is valid, false otherwise
     */
    public boolean validPosition(Position P){
	int pX = P.getX();
	int pY = P.getY();
	int width = this.board[0].length;
	int hight = this.board.length;
	if (pX > width || pY > hight)
	    return false;
	else
	    return true;
	}

    /** print the board for the defender or the 
     * @param defender print the board for defender if true, print the board for attacker if false
     */
    public void display(boolean defender){
	    for (int i = 0; i < this.board.length; i++){
			for (int u = 0; u < this.board[i].length; u++){
			    System.out.print(this.board[i][u].getCharacter(defender));
			}
			System.out.print("\n");
	    }
    }

    /** add the Ship shipToPlace vertically in the Position position
     * @param shipToPlace the ship that we want to place vertically on the Position position
     * @param position the position where we want to place the Ship shipToPlace
     * @exception ArrayIndexOutOfBoundsException if the position is not valid
     * @exception IllegalStateException if the cell on the Position position is not empty
     */
    public void addShipVertically(Ship shipToPlace, Position position) throws ArrayIndexOutOfBoundsException, IllegalStateException {
	boolean empty = true;
	if (!(validPosition(position)))
	    throw new ArrayIndexOutOfBoundsException("Invalid Position");
	else{
	    // Check if the cells are empty first
	    for (int i = 0; i < shipToPlace.getLifePoints(); i++){
		if (!(this.board[position.getY() + i][position.getX()].isEmpty()))
		    empty = false;
	    }
	    if (empty) { // if it is empty
		for (int i = 0; i < shipToPlace.getLifePoints(); i++)
		    this.board[position.getY() + i][position.getX()].add(shipToPlace);
			this.lifePointsOnBoard += shipToPlace.getLifePoints();
	    }
	    else
		throw new IllegalStateException("Cell not empty");
	}
    }

    /** add the Ship shipToPlace horizontally in the Position position
     * @param shipToPlace the ship that we want to place horizontally on the Position position
     * @param position the position where we want to place the Ship shipToPlace
     * @exception ArrayIndexOutOfBoundsException if the position is not valid
     * @exception IllegalStateException if the cell on the Position position is not empty
     */
    public void addShipHorizontally(Ship shipToPlace, Position position) throws ArrayIndexOutOfBoundsException, IllegalStateException{
	boolean empty = true;
	if (!(validPosition(position)))
	    throw new IllegalStateException("Position Invalid");
	else{
	    // Check if the cells are empty first
	    for (int i = 0; i < shipToPlace.getLifePoints(); i++){
		if (!(this.board[position.getY()][position.getX() + i].isEmpty()))
			empty = false;
	    }
	    if (empty) { // if it is empty
		for (int i = 0; i < shipToPlace.getLifePoints(); i++)
		    this.board[position.getY()][position.getX() + i].add(shipToPlace);
	    this.lifePointsOnBoard += shipToPlace.getLifePoints();
	    }else
		throw new IllegalStateException("Cell not empty");
	}
    }
    public int getLifePointsOnBoard() {
    	return this.lifePointsOnBoard;
    }
}