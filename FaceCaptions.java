/**
 * Auto Generated Java Class.
 */
import java.awt.*;
public class FaceCaptions {
  
  
  public static void main(String[] args) { 
    String filename;
    
    if (args.length > 0) {
       // got a filename passed into program as a runtime parameter
       filename = args[0];      
       System.out.println("Filename passed in: " + filename);
       
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    
    // use the filename to create the picture object
    Picture pic = new Picture(filename);
    Turtle tom = new Turtle(pic);
    tom.setPenColor(Color.red);
    tom.setPenWidth(6);
    tom.penUp();
    tom.moveTo(197, 311);
    // Starts to draw a box
    tom.penDown();
    tom.moveTo(358, 311);
    tom.moveTo(358, 498);
    tom.moveTo(197, 498);
    tom.moveTo(197, 311);
    //Start of face features
    tom.drawBowtie(190, 568, Color.red);//
    tom.drawMustache(240, 495, Color.black);
    //Start of face captions
    drawPhrase1(tom, 10, 150);
    drawPhrase2(tom, 10, 300);
    
    pic.show();
  }
  public static void drawPhrase1(Turtle t, int xPos, int yPos){
    //Draws the word STATIC
    t.setHeading(0);
    t.moveTo(xPos, yPos);
    TurtleAlphabet.drawSBoldSize(t, Color.white, true, 1);
    TurtleAlphabet.drawTBoldSize(t, Color.blue, true, 1);
    TurtleAlphabet.drawABoldSize(t, Color.white, true, 1);
    TurtleAlphabet.drawTBoldSize(t, Color.blue, true, 1);
    TurtleAlphabet.drawIBoldSize(t, Color.black, true, 1);  
    TurtleAlphabet.drawCBoldSize(t, Color.cyan, true, 1);
    
    
    t.setHeading(90);
    t.penUp();
  }
  
  public static void drawPhrase2(Turtle t, int xPos, int yPos){
    //Draws the word METHOD
    t.setHeading(0);
    t.moveTo(xPos, yPos);
    TurtleAlphabet.drawMBoldSize(t, Color.blue, true, 1);
    TurtleAlphabet.drawEBoldSize(t, Color.white, true, 1);
    TurtleAlphabet.drawTBoldSize(t, Color.red, true, 1);
    TurtleAlphabet.drawHBoldSize(t, Color.blue, true, 1);
    TurtleAlphabet.drawOBoldSize(t, Color.black, true, 1);
    TurtleAlphabet.drawDBoldSize(t, Color.magenta, true, 1);
    TurtleAlphabet.drawSBoldSize(t, Color.pink, true, 1);
    
    t.setHeading(90);
    t.penUp();
    
  }
  


}
