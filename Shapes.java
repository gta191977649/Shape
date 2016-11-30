import java.util.LinkedList;

/**
 * class Shapes - contains a list of Shape objects
 * 
 */
public class Shapes
{
    //instance variables
    private LinkedList<Shape> shapes  = new LinkedList<Shape>();
    /**
     * Constructor for objects of class Shapes
     */
    public Shapes()
    {         
           
           
           
    }
    /**
     * listProperties - prints the area and perimeter of each shape in the list
     * 
     */
    public void listProperties()
    {
        for(Shape current : shapes)
        {
            System.out.println("Area is:" +current.area());
            System.out.println("Perimeter is:" +current.perimeter());
        }
    }
}
