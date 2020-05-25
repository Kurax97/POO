
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
    private int quantity;
    
    public Stock(){
        this.quantity = 0;
    }
    
    public Stock(int c){
        this.quantity = c;
    }
    
    /**
     * returns the quantity on the stock
     * @returns the quantity on the stock
     */
    public int getQuantity(){
        return this.quantity;
    }
    
    public void add(int i){
        this.quantity += i;
    }
    
    public int remove(int i){
        if (i < this.quantity){
            this.quantity -= i;
            return i;
        }else{
            int c = this.quantity;
            this.quantity = 0;
            return c;
        } 
    }
    
    public String toString(){
        return "The stock's quantity is " + this.quantity;
    }
}