/* Lab 9, Part B: Created by Celine Latulipe  */  
public class Lab9PartB {   
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

    // now make the picture so that the top-left quadrant is mirrored in 
    // the other three quadrants by calling the quadrefoil() method
    pic.verticalShutters();
    // show the picture
    pic.show();
    

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab9PartB.jpg");
    if (args.length > 1) {
      outfilename = args[args.length - 1];    
    }
    pic.write(outfilename);
  } 
}  