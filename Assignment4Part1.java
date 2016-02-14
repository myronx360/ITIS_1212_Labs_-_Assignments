/* Assignment4Part1: Created by Celine Latulipe  */  
import java.awt.Color;

public class Assignment4Part1 {   
  public static void main(String [] args) throws InterruptedException  
  {     
    String filename1;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the grader.
       filename1 = args[0];      
       System.out.println("Filename passed in: " + filename1);
       
    } else {
       // ask user for a picture
       filename1 = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename1);
    }
    Picture pic = new Picture(filename1);
    // get a world the correct size for the picture
    World w = new World(pic.getWidth(), pic.getHeight());
    // put the picture in the world
    w.setPicture(pic);
    
    // test shrink
    Picture scaledPic;
    scaledPic = pic.shrink(4);
    scaledPic.show();
    
    Thread.sleep(500);
   
    scaledPic = pic.shrink(3);
    scaledPic.show();
    
   Thread.sleep(500);
    
    scaledPic = pic.shrink(2);
    scaledPic.show();
    
    Thread.sleep(500);
    
    // this shouldn't work - should return an error
    scaledPic = pic.shrink(1);
    
   Thread.sleep(500);
    
    // this shouldn't work - should return an error
    scaledPic = pic.shrink(5);
    

  } 
}  