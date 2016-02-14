import java.awt.Color;

public class Lab4PartC 
{   
  public static void main(String [] args) 
  {
    // create a world
    World w = new World();
    
    /* These define a home base for the turtle */
    final int KARIM_HOME_X = 300;
    final int KARIM_HOME_Y = 250;
    final int MAX_RAY_LENGTH = 250;
    
    /* Create turtles, using the home base constants */
    Turtle karim = new Turtle(KARIM_HOME_X, KARIM_HOME_Y, w);
    
    /* Make karim draw yellow rays */
    karim.setPenColor(Color.yellow);
    
    /* This integer variable will determine a travel distance. 
     * we give it a starting value of 100, but it can change */
    int distance = 100;
    
    /* This double (decimal) variable is the angle Karim should turn 
     * we give it a starting value of 35.0, but it can also change */
    double heading = 35.0;
    
    
    // make a starburst pattern
    // this uses a for loop which we will talk about later
    // just know that the code inside the for loop below is executed 50 times
    for (int i = 0; i< 50; i++) {
      distance = (int)(Math.random()*MAX_RAY_LENGTH); 
      System.out.println(distance);
      heading = Math.random()*360.0;
      
      karim.setHeading(heading);
      karim.forward(distance);   
      karim.moveTo(KARIM_HOME_X, KARIM_HOME_Y);
      
    }
    
  }
  

}


