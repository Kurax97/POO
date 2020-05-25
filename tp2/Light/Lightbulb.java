

/**
 * This class controls and shows the state, color and the power for a lightbulb 
 *
 * @author Benlamlih Mohammed
 * @version 1.0
 */
public class Lightbulb
{
    private double power;
    private String color;
    private boolean state;
    
    /**
     * constructor for class Lightbulb
     */
    public Lightbulb(double power, String color, boolean state){
         this.power = power;
         this.color = color;
         this.state = state;
    }
    
    /**
     * changes the state of the bulb
     */
    public void changeState(){
        this.state = !state;
    }
    
    /**
     * returns true if the blub is On, false otherwise
     * @returns true if the blub is On, false otherwise
     */
    public boolean isOn(){
        if (this.state == true)
            return true;
        return false;
    }
    
    /**
     * returns true if the bulb is Off, false otherwise
     * @returns true if the bulb is Off, false otherwise
     */
    public boolean isOff(){
        if (this.state == false)
            return true;
        return false;
    }
    
    /**
     * returns the power of the bulb
     * @returns the power of the bulb
     */
    public double getPower(){
        return this.power;
    }
    
    /**
     * returns the color of the bulb
     * @returns the color of the bulb
     */
    public String getColor(){
        return this.color;
    }
    
    /**
     * returns a String: "On" if the state of the bulb is true, "Off" otherwise
     * @returns a String: "On" if the state of the bulb is true, "Off" otherwise
     */
    public String getState(){
        if (state)
            return "On";
        return "Off";
    }
    
    /**
     * returns a String that describe the power, the color and the state of the bulb
     * @returns a String that describe the power, the color and the state of the bulb
     */
    public String toString(){
        return "This is a " + this.power + "W bulb in " + this.color + " color and it is " + getState(); 
    }
}
