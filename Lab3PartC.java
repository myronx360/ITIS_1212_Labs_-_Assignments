/* Turtle Drawing Program Lab 3, Part C */
/* Started by Bruce Long */

public class Lab3PartC {
//  public static void main(String [] args)
  public Lab3PartC() {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Make tom draw a hexagon */
    tom.drawHexagon();
  }

}