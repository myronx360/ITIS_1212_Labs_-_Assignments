import java.awt.Color;

public class LetterCollage {
  public static void main(String [] args) {
  //Creates a world and turtle
  World w = new World();
  Turtle t = new Turtle(100,100, w);
  //Set background color
  t.setPenColor(Color.cyan);
  t.setPenWidth(50000);
  t.moveTo(500,500);
  
  
  //writeName(Color c, int startXPos, int startYPos)
  t.setPenWidth(5);
  t.writeName(Color.blue, 25, 75);
  t.setPenWidth(5);
  t.writeName(Color.red, 320, 75);
  t.setPenWidth(8);
  t.writeName(Color.black, 150, 385);
  t.setPenWidth(10);
  t.writeName(Color.yellow, 25, 470);
  t.setPenWidth(10);
  t.writeName(Color.green, 320, 470);
 
  
  
  //drawO(Color c, int angle, int dist, int penWidth, int xPos, int Ypos
  //Draws the Olympic logo
  t.drawO(Color.blue, -40, 40, 10, 220, 170);
  t.drawO(Color.yellow, -40, 40, 10, 285, 230);  
  t.drawO(Color.black, -40, 40, 10, 350, 170);
  t.drawO(Color.green, -40, 40, 10, 415, 230); 
  t.drawO(Color.red, -40, 40, 10, 480, 170);
  
  //Creates and moves a blue turtle to the center the blue O
  Turtle tBlue = new Turtle(165,190, w);
  tBlue.setShellColor(Color.blue);
  tBlue.setBodyColor(Color.blue);
  tBlue.setHeading(45);
  
  //Creates and moves a black turtle to the center the black O
  Turtle tBlack = new Turtle(295,190, w);
  tBlack.setShellColor(Color.black);
  tBlack.setBodyColor(Color.black);
  
  
  //Creates and moves a red turtle to the center the red O
  Turtle tRed = new Turtle(425,190, w);
  tRed.setShellColor(Color.red);
  tRed.setBodyColor(Color.red);
  tRed.setHeading(-45);
  
  //Creates and moves a yellow turtle to the center the yellow O
  Turtle tYellow = new Turtle(230,250, w);
  tYellow.setShellColor(Color.yellow);
  tYellow.setBodyColor(Color.yellow);
  tYellow.setHeading(45);
  
  //Creates and moves a green turtle to the center the green O
  Turtle tGreen = new Turtle(360,250, w);
  tGreen.setShellColor(Color.green);
  tGreen.setBodyColor(Color.green);
  tGreen.setHeading(-45);
  
  
  }
}

