
/**
 * This class controls the state of a specific lightbulb 
 *
 * @author Benlamlih Mohammed
 * @version 1.0
 */
public class Switch
{
    private static Lightbulb light;
    
    /**
     * constructor for class Switch
     */
    public Switch(Lightbulb light){
        this.light = light;
    }
    
    /**
     * changes the state of the lightbulb
     */
    public void clickSwitch(){
        this.light.changeState();
    }
}
