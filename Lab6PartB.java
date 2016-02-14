/* Turtle Drawing Program Lab 6, Part B */
/* Started by Celine Latulipe */

public class Lab6PartB {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom */
    Turtle tom = new Turtle(w);
    
    /* test the getDistance() method */
    int dist = tom.getDistance();
    System.out.println("This should print out the value 400. Value is: " + dist);
    
    tom.moveTo(500, 400);
    dist = tom.getDistance();
    System.out.println("This should print out the value 640. Value is: " + dist);
    
    tom.moveTo(250, 300);
    dist = tom.getDistance();
    System.out.println("This should print out the value 390. Value is: " + dist);
    
    /* TODO: add another test, by moving the turtle elsewhere. 
     * Use a calculator to check what the value SHOULD be, and 
     * add a print statement to ensure your getDistance() method is returning the 
     * correct value */
    
    
  }
}