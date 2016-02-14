/* Lab 8, Part D: Created by Celine Latulipe  */  
public class Lab8PartD {   
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
    
    // open a second picture. Make sure it is the EXACT same dimensions
    if (args.length > 1) {
      filename2 = args[1];
      System.out.println("Second filename passed in: " + filename2);
    } else {
      filename2 = FileChooser.pickAFile();
      System.out.println("User picked a second file: " + filename2);
    }
    
    Picture source = new Picture(filename2);
    // call weighted average pixels method
    pic.weightedAverageWithSource(source, .8);
    // update display
    w.modelChanged();

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file 
    String outfilename = SimplePicture.getMediaPath("Lab8PartD.jpg");
    System.out.println("Saving output to " + outfilename);
    if (pic.write(outfilename)) {
      System.out.println("Save successful"); 
    } else {
      System.out.println("Couldn't write file out");
    }
  } 
}  