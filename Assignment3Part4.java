/**
 * Myron Williams.
 */
public class Assignment3Part4 {
  
  /**Makes an animation of a picture that goes psychedelic three, 
    * then goes Stripey, and then slowly gets more and more blurred.*/
  public static void main(String [] args) throws InterruptedException {
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
    
    // TODO: insert method call to tint your picture
    pic.tentRed();
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    
    // TODO: insert method call to tint your picture
    pic.tentGreen();
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    
    // TODO: insert method call to tint your picture
    pic.tentBlue();
    pic.repaint();          // Show the tinted picture
    Thread.sleep(1000);     //  Pause for 1 second
    
    /************* Stripey ********************/
    Pixel[] pixelArray = pic.getPixels();
    
    // TODO: put your stripey tinting code here
    double startPortion = 0.0;
    double endPortion = 0.10;
    Pixel pixel = null;
    int stripe = 0;
    int index = (int)(pixelArray.length * startPortion);
    int redValue = 0;
    int greenValue = 0;
    int blueValue = 0;  
    double amount = .5;
    
    //loop through all the pixels
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
        //set the red value of current pixel to the new value
        pixel.setRed(redValue);
        pixel.setGreen(greenValue);
        pixel.setBlue(blueValue);
        //increament the index
        index++;
      }// End of looping through a portion of the pixels
      
      //Sets up the next stripe of colors
      startPortion = endPortion;
      endPortion += .10;
      // Checks what color stripe to tent picture with
      if (stripe >= 2){
        stripe = 0; 
      }else{
        stripe++;
      }
      pic.repaint();
      // checks if the last stripe will fit on the picture
      if (endPortion >= 1){
        // TODO: call your averaging method here, 
        // put it inside a loop so that it gets called multiple times
        // you decide how many times, but blurring must be obvious
        for(int b = 0;b < 15; b++){
          pic.averagePixelsHorizontally();
          pic.repaint();
        } // End of for loop
      }// End of if statement
    }// End of looping through all the pixels
  } // End of main
}// End of class