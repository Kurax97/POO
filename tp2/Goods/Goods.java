
/**
 * Write a description of class Goods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goods{
    private double value;
    private String name;
    
    /**
     * First Construstor with one parameter
     */
    public Goods(String name){
        this.name = name;
        this.value = 0;  
    }
    
    /**
     * First Construstor with two parameters
     */
    public Goods(double value, String name){
        this.name = name;
        this.value = value;
    }
    
    /**
     * returns the value
     * @returns the value
     */
    public double getValue(){
        return this.value;
    }
    
    /**
     * returns the name
     * @returns the name
     */
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "The goods " + this.name + " costs " + this.value;
    }
    
    /**
     * returns the final price of the goods tax included
     * @returns the final price of the goods tax included
     */
    public double finalPrice(){
        double tva = this.value * 0.2;
        double finalPrice = this.value + tva;
        return finalPrice;
    }
    
}
