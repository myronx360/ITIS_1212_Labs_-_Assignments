/* Turtle Drawing Program Lab 3, Part E */
/* Started by Bruce Long */

import java.awt.Color;

public class Lab3PartF {
  public static void main(String [] args) 
  {
    /* Create a world named w */
    World w = new World();
    
    /* Create a turtle, call him tom, put him at (x=100, y=200) in the world named w */
    Turtle tom = new Turtle(100, 200, w);
    
    /* TODO - Insert a command below here to draw a hexagon with side lengths of 50 and a pen width of 6  */
    tom.penUp();
    tom.moveTo(250, 250);
    tom.penDown();
    tom.setPenColor(Color.blue);
    tom.drawHexagonOfLengthPen(60, 5, 90, 200, 200);
    tom.penUp();
    
    tom.turn(120);
    tom.penDown();
    tom.setPenColor(Color.red);
    tom.drawHexagonOfLengthPen(60, 5, 90, 250, 250);
    tom.penUp();
    
    tom.turn(120);
    tom.penDown();
    tom.setPenColor(Color.green);
    tom.drawHexagonOfLengthPen(60, 5, 90, 350, 350);
    tom.penUp();
    
    
  }
}