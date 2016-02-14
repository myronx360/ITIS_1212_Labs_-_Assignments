/* Turtle Drawing Program Lab 3, Part D */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab3PartD {
  public static void main(String [] args) 
  {
    /* Create the world */
    World w = new World();
    
    /* Create the turtle, call him Tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* Set pen color to red.  */
    tom.setPenColor(Color.red);
    
    /* Draw a hexagon of length 80 */
    tom.drawHexagonOfLength(10);
    tom.penUp();
    tom.moveTo(300, 150);
    tom.penDown();
    tom.setPenColor(Color.blue);
    tom.drawHexagonOfLength(80);
  }
  
  
}