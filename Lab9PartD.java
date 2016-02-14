/* Lab 9, Part D: Created by Celine Latulipe  */  
public class Lab9PartD {   
  public static void main(String [] args) throws InterruptedException  
  {   
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
    // show it
    pic.show();
    
    // wait a second
    Thread.sleep(1000);
    // call the tile method
    // save resulting picture to a variable so we can show it
    Picture result;
    result = pic.tile();
    // show the new picture
    result.show();

    

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab9PartD.jpg");
    System.out.println("Writing result to " + outfilename);
    if (pic.write(outfilename)) {
      System.out.println("Save successful");
    } else {
      System.out.println("Couldn't write file out");
    }
  } 
}  