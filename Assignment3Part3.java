/* Assignment 3, Part 3 - Go Blurry! 
 * Myron Williams*/
public class Assignment3Part3
{
//
  public static void main(String [] args) throws InterruptedException
  {
    String filename;
    if (args.length > 0) {
      // got a filename passed into program as a parameter
      // don't change this part of the code needed by TA for grading
      filename = args[0];      
      System.out.println("Filename passed in: " + filename);
      
    } else {
      // ask user for a picture
      filename = FileChooser.pickAFile();
      System.out.println("User picked file: " + filename);
    }
    Picture pic = new Picture(filename);   // Picture to modify
    //
    pic.show();             // Show the original picture
    Thread.sleep(1000);     //  Pause for 1 second.  You can pause for less if you like
    
    // TODO: call your averaging method here, 
    // put it inside a loop so that it gets called multiple times
    // you decide how many times, but blurring must be obvious
    for(int i = 0;i < 100; i++){
      pic.averagePixelsHorizontally();
      pic.repaint();
    }
  }
}
