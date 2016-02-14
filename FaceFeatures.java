/**
 * Auto Generated Java Class.
 */
import java.awt.*;
public class FaceFeatures {
  
  
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
    tom.drawBowtie(168, 548, Color.red);
    tom.drawMustache(230, 470, Color.black);
    
    pic.show();
    

    
  }
  


}
