/* Turtle Program Lab 6, Part C */
/* Started by Celine Latulipe */

public class Lab6PartC {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the first turtle, call her Jen */
    Turtle jen = new Turtle(w);
    
    /* Create the second turtle, call him Tom */
    Turtle tom = new Turtle(w);
    
    // Move them around
    jen.forward(10);
    tom.turn(20);
    tom.forward(40);
    
    // check if close (should return true)
    boolean result= tom.isTurtleClose(jen, 50);
    System.out.println("Test 1: should print out true. result is: " + result);
    
    // TODO: add test to check false condition (move turtles far away from each other)
    tom.forward(40);
    boolean result2= tom.isTurtleClose(jen, 50);
    System.out.println("Test 2: should print out true. result is: " + result2);
    
    // TODO: add a test where you pass in a negative threshold value, to check condition
    boolean result3= tom.isTurtleClose(jen, -50);
    
  }
}