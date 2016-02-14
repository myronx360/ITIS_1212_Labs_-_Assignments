/* Assignment 3, Part 2 - Go Dutch! 
 * Myron Williams*/
public class Assignment3Part2
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
    
    Pixel[] pixelArray = pic.getPixels();
    
    // TODO: put your stripey tinting code here
    double startPortion = 0.0;
    double endPortion = 0.10;
    Pixel pixel = null;
    int stripe= 0;
    int index = (int)(pixelArray.length * startPortion);
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;  
    double amount = .5;
    
    //loop through all of the pixels
    while (index<pixelArray.length - 1){
      //loop through a portion of the pixels
      while(index < (int)(pixelArray.length * endPortion)) {
        // get the current pixel
        pixel = pixelArray[index];
        //get the value
        redValue = pixel.getRed();
        greenValue = pixel.getGreen();
        blueValue = pixel.getBlue();
        //Tent the color value by amount%
        if (stripe == 0){//Purple
          redValue = redValue + ((int) (redValue * amount));
          greenValue = greenValue - ((int) (greenValue * amount));
          blueValue = blueValue + ((int) (blueValue * amount));
        }else if(stripe == 1) { //Cyan
          redValue = redValue - ((int) (redValue * amount));
          greenValue = greenValue + ((int) (greenValue * amount));
          blueValue = blueValue + ((int) (blueValue * amount));
        }else{//Yellow
          redValue = redValue + ((int) (redValue * amount));
          greenValue = greenValue + ((int) (greenValue * amount));
          blueValue = blueValue - ((int) (blueValue * amount));
        }
        //set the color value of current pixel to the new value
        pixel.setRed(redValue);
        pixel.setGreen(greenValue);
        pixel.setBlue(blueValue);
        //increament the index
        index++;
      }// end of looping through a portion of the pixels
      
      //Sets up the next stripe of colors
      startPortion = endPortion;
      endPortion += .10;
      // Checks what color stripe to tent picture with
      if (stripe >= 2){
        stripe= 0; 
      }else{
        stripe++;
      }
      pic.repaint();
    }// End of looping through all of the pixels
  }  // End of main
}  // End of Class