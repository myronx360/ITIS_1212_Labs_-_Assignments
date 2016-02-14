/* Assignment4Part2: Created by Celine Latulipe  */  
import java.awt.Color;

public class Assignment4Part2 {   
  public static void main(String [] args) throws InterruptedException  
  {     
    String filename1;
    String filename2;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
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
    
    Thread.sleep(500); // pause so you can see the first image appear in the world
    if (args.length > 1) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename2 = args[1];      
       System.out.println("Filename passed in: " + filename2);
       
    } else {
       // ask user for a picture
       filename2 = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename2);
    }
    Picture target = new Picture(filename2);
    
    
    // test reveal
    // note, it's up to you to test this with pictures of different sizes to make sure your preconditions checks
    // are working.
    for (int i = 0; i < 100; i++) {
        // call average pixels method
        pic.concealLeftToRight(target, i/100.0, i/100.0, 10, 90);
        // update display
        w.modelChanged();
       //Thread.sleep(100);
      } 
  } 
}  