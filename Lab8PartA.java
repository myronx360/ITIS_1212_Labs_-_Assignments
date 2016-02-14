/* Lab 8, Part A: Created by Celine Latulipe  */  
public class Lab8PartA {   
  public static void main(String [] args) throws InterruptedException  
  {     
    // get a picture
    String filename;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename = args[0];
       System.out.println("Filename passed in: " + filename);
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    
    Picture pic = new Picture(filename);
    // get a world the correct size for the picture
    World w = new World(pic.getWidth(), pic.getHeight());
    // put the picture in the world
    w.setPicture(pic);
    
    int i = 0;
    while (i < 5){
      // now fade the picture
      pic.fade();
      // tell the world to update so we see the new picture
      w.modelChanged();
      // wait a quarter of a second
      Thread.sleep(250); 
      
      
      // now fade the picture
      pic.fade();
      // tell the world to update so we see the new picture
      w.modelChanged();
      // wait a quarter of a second
      Thread.sleep(250); 
      i++;
    }

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab8PartA.jpg");
    if (args.length > 1) {
      outfilename = args[args.length - 1];
    } 
  //  w.paintComponent(pic.getGraphics());
    pic.write(outfilename);
  } 
}  