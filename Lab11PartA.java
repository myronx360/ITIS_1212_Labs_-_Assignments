/* Lab 11, Part A: Created by Celine Latulipe  */  
public class Lab11PartA {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String filename1;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename1 = args[0];      
       System.out.println("Filename passed in: " + filename1);
       
    } else {
       // ask user for a picture
       System.out.println("Please open a file.");
       filename1 = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename1);
    }
    Picture pic = new Picture(filename1);
    pic.show();

    // blur area 1 of picture
    pic.blackOut(110, 182, 138, 169);
    // blur area 2 of picture
    pic.blackOut(100, 190, 100, 130);
    // update display
    pic.repaint();

   // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab11PartA.jpg");
    if (args.length > 1) {
      outfilename = args[args.length - 1];    
    }
    pic.write(outfilename);
  } 
}  