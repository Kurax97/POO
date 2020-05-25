
/**
 * This class controls a light string 
 *
 * @author Mohammed Benlamlih
 * @version 1.0
 */
public class LightString
{
    private int numberOfBulb;
    private Lightbulb [] tableLight;
    private double power = 1;
    private String color = "white";
    private boolean state = false;
    
    /**
     * constructor for class LightString
     */
    public LightString(int numberOfBulb){
        Lightbulb [] tab;
        tab = new Lightbulb[numberOfBulb];
        for (int i = 0; i < tab.length; i++){
            tab [i] = new Lightbulb(this.power, this.color, this.state);
        }
        this.tableLight = tab;
        this.numberOfBulb = numberOfBulb;
    }
    
    /**
     * changes the state of the light string turn On if Off, trun Off otherwise
     */
    public void changeState(){
        for (int i = 0; i < this.tableLight.length; i++){
            tableLight[i].changeState();
        }
    }
    
    /**
     * retruns a string "On" if the light string is On, returns "Off" otherwise
     */
    public String getState(){
        if (isOn())
            return "On";
        return "Off";
    }
    
    /**
     * changes the color of the light string
     * 
     */
    public void changeColor(String col){
        this.color = col;
    }
    
    /**
     * return a String : The color of the light string
     */
    public String getColor(){
        return this.color;
    }
    
    /**
     * return true even if even bulbs or odd bulbs are On
     */
    public boolean isOn(){
        return this.tableLight[0].isOn() || this.tableLight[1].isOn();
    }
    
    /**
     * return off if all the bulbs are off
     */
    public boolean isOff(){
        return this.tableLight[0].isOff() && this.tableLight[1].isOff();
    }
    
    /**
     * trun on only the even bulbs of the light string
     */
    public void turnOnEven(){
        for (int i = 0; i < this.tableLight.length; i++){
            if (i % 2 == 0 && this.tableLight[i].isOff()){
                this.tableLight[i].changeState();
            }
        }
    }
    
    /**
     * trun off only the even bulbs of the light string
     */
    public void turnOffEven(){
        for (int i = 0; i < this.tableLight.length; i++){
            if (i % 2 == 0 && this.tableLight[i].isOn()){
                this.tableLight[i].changeState();
            }
        }
    }
    
    /**
     * trun on only the odd bulbs of the light string
     */
    public void turnOnOdd(){
        for (int i = 0; i < this.tableLight.length; i++){
            if (i % 2 != 0 && this.tableLight[i].isOff()){
                this.tableLight[i].changeState();
            }
        }
    }
    
    /**
     * trun off only the odd bulbs of the light string
     */
    public void turnOffOdd(){
        for (int i = 0; i < this.tableLight.length; i++){
            if (i % 2 != 0 && this.tableLight[i].isOn()){
                this.tableLight[i].changeState();
            }
        }
    }
    
    /**
     * returns a string describing the state, the colors and the number of bulbs in the light string
     */
    public String toString(){
        return "The light string is composed of " + this.numberOfBulb + " " + this.getColor() +" bulbs and it is " + this.getState();
    }
}
