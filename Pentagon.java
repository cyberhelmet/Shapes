import java.awt.Color;
import kit101.turtle.Turtle;
/**
 * A Pentagon (implemented as a 5 sided polygon).
 * 
 * @author KIT101 Teaching Team, Abhishek Tamang
 */
//Extending class Polygon to subclass Pentagon
public class Pentagon extends Polygon {
    
    protected final int sides=3; //number of sides (read only)
    protected double sideLength; //length of the sides (read only)
    
    //constructor for the class Pentagon 
    public Pentagon(int sides,double sideLength, int x, int y, Color color, Turtle device) {
        super(sides,sideLength,x, y,color, device);
    }    
}