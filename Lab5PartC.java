/* Turtle Drawing Program Lab 5, Part C */
/* Started by Celine Latulipe */

import java.util.Scanner;                       // Include this line to import the Scanner utility

public class Lab5PartC
{
  public static void main(String [] args)
  {
    World w = new World();
    Turtle tom = new Turtle(100, 200, w);
    // Part 1
    Scanner keyboard = new Scanner(System.in);  // Include these two
    int x = keyboard.nextInt();                 // lines for integers
    drawHexagon(tom, x);
    
    
  
 }
    

                            
    public static void drawHexagon(Turtle t, int length) {
    t.forward(length);
    t.turn(60);
    t.forward(length);
    t.turn(60);
    t.forward(length);
    t.turn(60);
    t.forward(length);
    t.turn(60);
    t.forward(length);
    t.turn(60);
    t.forward(length);
    t.turn(60);
    }
}