import java.awt.Color;
import kit101.turtle.Turtle;

/**
 * A circle (implemented as a many-sided polygon).
 * 
 * @author KIT101 Teaching Team, Abhishek Tamang
 */
//Extending class Polygon to subclass Circle
public class Circle extends Polygon {
    public static final int FINENESS = 100;//variable describing the fineness of the circle's surface
    protected double radius; //circle's radius
    
    /**
     * Creates a new Circle with the given radius and centre, using the
     * given Turtle graphics device.
     */
    public Circle(double radius, int x, int y, Color color, Turtle device) {
        super(FINENESS,Math.sin(Math.PI/FINENESS)*radius*2,x,y,color,device);
        this.radius = radius;
    }
    
    //This methos provides String representation of the class Circle
    public String toString(){
        
        return "Circle(FINENESS=" + FINENESS + ", radius=" + radius + ", centre=" + centre + ")";
    }
    
    /** Returns the circle's radius. */
    public double getRadius() {
        return radius;
    }
    
}