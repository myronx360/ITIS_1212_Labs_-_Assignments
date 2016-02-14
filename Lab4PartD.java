import java.awt.Color;

public class Lab4PartD 
{   
  public static void main(String [] args) 
  {
    // create a world
    World w = new World();
    
    /* These define a home base for the turtle */
    final int KARIM_HOME_X = 300;
    final int KARIM_HOME_Y = 250;
    
    final int KESHA_HOME_X = 400;
    final int KESHA_HOME_Y = 250;
    
    final int KEVIN_HOME_X = 200;
    final int KEVIN_HOME_Y = 400;
    
    final int KORI_HOME_X = 100;
    final int KORI_HOME_Y = 300;
    
    final int KRIS_HOME_X = 400;
    final int KRIS_HOME_Y = 100;
    
    /* Create turtles, using the home base constants */
    Turtle karim = new Turtle(KARIM_HOME_X, KARIM_HOME_Y, w);
    // make kesha be a little bit to the right so we can see her 
    Turtle kesha = new Turtle(KESHA_HOME_X, KESHA_HOME_Y, w);
    
    Turtle kevin = new Turtle(KEVIN_HOME_X, KEVIN_HOME_Y, w);
    Turtle kori = new Turtle(KORI_HOME_X, KORI_HOME_Y, w);
    Turtle kris = new Turtle(KRIS_HOME_X, KRIS_HOME_Y, w);
    
    /* Make karim draw yellow rays */
    karim.setPenColor(Color.yellow);
    karim.setName("Karim");
    
    kesha.setPenColor(Color.blue);
    kesha.setName("Kesha");
    
    kevin.setPenColor(Color.red);
    kevin.setName("kevin");
    
    kori.setPenColor(Color.black);
    kori.setName("kori");
    
    kris.setPenColor(Color.green);
    kris.setName("kris");
    
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
      distance = (int)(Math.random()*200.0); 
      heading = Math.random()*360.0;
      
      karim.setHeading(heading);
      karim.forward(distance);   
      karim.moveTo(KARIM_HOME_X, KARIM_HOME_Y);
      
      kesha.setHeading(heading);
      kesha.forward(distance);   
      kesha.moveTo(KESHA_HOME_X, KESHA_HOME_Y);
      
      kevin.setHeading(heading);
      kevin.forward(distance);   
      kevin.moveTo(KEVIN_HOME_X, KEVIN_HOME_Y);
      
      kori.setHeading(heading);
      kori.forward(distance);   
      kori.moveTo(KORI_HOME_X, KORI_HOME_Y);
      
      kris.setHeading(heading);
      kris.forward(distance);   
      kris.moveTo(KRIS_HOME_X, KRIS_HOME_Y);
    }
    
    // end by making karim and kesha face up
    karim.setHeading(0);
    kesha.setHeading(0);
    kevin.setHeading(0);
    kori.setHeading(0);
    kris.setHeading(0);
    // finally print out information about the world and the turtles
    System.out.println(w);
    System.out.println(karim);
    System.out.println(kesha);
    System.out.println(kevin);
    System.out.println(kori);
    System.out.println(kris);

  }
  
  
}


