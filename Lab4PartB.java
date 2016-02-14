import java.awt.Color;

public class Lab4PartB
{   
  public static void main(String [] args) 
  {
    // create a world
    World w = new World();
    
    /* Create a turtle */
    Turtle jen = new Turtle(200, 200, w);

    /* TODO: Change the turtle's state here */
    //body color of red, a pen color of blue
    //a pen thickness of 5 and is facing northeast (45.0 degrees)
    jen.setBodyColor(Color.red);
    jen.setPenColor(Color.blue);
    jen.setPenWidth(5);
    jen.setHeading(45); 
    
    
    /* Don't change these lines */
    jen.forward(50); 
    System.out.println(jen); // this will print out information about the turtle jen to the console

  }
   
}


 