/* Lab 10, Part B: Created by Celine Latulipe  */  
public class Lab10PartB {   
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
    pic.show();
    
    // open a second picture. Make sure it is the EXACT same dimensions
    if (args.length > 1) {
      filename2 = args[1];
      System.out.println("Second filename passed in: " + filename2);
    } else {
      filename2 = FileChooser.pickAFile();
      System.out.println("User picked a second file: " + filename2);
    }
    Picture source = new Picture(filename2);

    // copy target into first picture
    pic.simpleCopyFromSource(source);
    // update display
    pic.repaint();
    
    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab10PartB.jpg");
    if (args.length > 2) {
      outfilename = args[args.length - 1];    
    }
    pic.write(outfilename);
  } 
}  