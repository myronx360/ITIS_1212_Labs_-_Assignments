// Myron Williams
import java.awt.Color;
public class Collage {
  
  public static void main(String[] args) throws InterruptedException {
    int numberOfPics = 14;
    String worldFile;
    String [] filename = new String[numberOfPics];
    
    System.out.println("Pick a world file picture");
    worldFile = FileChooser.pickAFile();
    System.out.println("User picked a world file.");
    Picture worldPic = new Picture(worldFile);
    // get a world the correct size for the picture
    World w = new World(worldPic.getWidth(),worldPic.getHeight());
    Turtle t = new Turtle(w);
    // put the picture in the world
    w.setPicture(worldPic);
    int randXPos = 0;
    int randYPos = 0;
    int modifier = 0;
    
    // Picks 10 files and puts them in filename[]
    for (int i = 0; i < numberOfPics; i++){
      filename[i] = FileChooser.pickAFile();
      Picture pics = new Picture(filename[i]);  
      
      // Checks to see if the picture will fit into the world
      if (pics.getWidth() <= worldPic.getWidth() && pics.getHeight() <= worldPic.getHeight()){
        // Gets a random X and Y position
        randXPos = (int) (Math.random() * worldPic.getWidth());
        randYPos = (int) (Math.random() * worldPic.getHeight());
        
        // Checks if the random X or Y position is too far off the world 
        //and then gets new X and Y postions 
        while (((randXPos + pics.getWidth()) > worldPic.getWidth()) || 
               ((randYPos + pics.getHeight()) > worldPic.getHeight())){
          randXPos = (int) (Math.random() * worldPic.getWidth());
          randYPos = (int) (Math.random() * worldPic.getHeight());
        }
        
        // Prints out the number of files and the file path chosen by filechooser 
        System.out.println("User picked file number: " +(i+1)+ "\n" + filename[i]);
        // Modifies the pictures
        if (i == 0){// Changes the first pictures with the new method from part 1
           System.out.println("Running Conceal left to right method");
          for (int conceal = 0; conceal < 100;conceal++) {
            // call concealLeftToRight pixels method
            pics.concealLeftToRight(worldPic, conceal/100.0, conceal/100.0, 5,95);
            // update display
            worldPic.copyPictureTo(pics,randXPos,randYPos);
            w.modelChanged();
          }
        }else{// Changes the rest of the pictures
          if (modifier < 11){// scroll through the list of 11 modifiers
            modifyPic(pics,modifier);
            modifier++;
          }else{ // reset modifier varible to scroll back through the list of modifiers
            modifier = 0;
            modifyPic(pics,modifier);
            modifier++;
          }
        }
        // Copies the picture to a random X & Y location
        worldPic.copyPictureTo(pics,randXPos,randYPos);
        w.modelChanged();
        
      }else{// the picture is too large for the world
        System.err.println("Error!:Picture is too large for the world");
      }
    }
    // Do Turtle stuff
    turtleStuff(t);
  }
  
  
  public static Picture modifyPic (Picture pic, int modifier) {
    switch(modifier) {
      case 0:
        System.out.println("Running blur area method");
        pic.blur(6);
        return pic;
        
      case 1:
        System.out.println("Running highlight Light And Dark method");
        pic.highlightLightAndDark(50.0, Color.yellow);
        return pic;
        
      case 2:
        System.out.println("Running horizontal shutters method");
        pic.horizontalShutters(5, Color.blue);
        return pic;
        
      case 3:
        System.out.println("Running black out area method");
        pic.blackOut(25,60,25,60);
        return pic;
        
      case 4:
        System.out.println("Running vertical shutters method");
        pic.verticalShutters(5, Color.black);
        return pic;
        
      case 5:
        System.out.println("Running Mirror Vertical method");
        pic.mirrorVertical();
        return pic;
        
      case 6:
        System.out.println("Running fade method");
        for (int i = 0; i < 5;i++){
        pic.fade();
      }
        return pic;
        
      case 7:
        System.out.println("Running posterize method");
        pic.posterize();
        return pic;
        
      case 8:
        System.out.println("Running negate method");
        pic.negate();
        return pic;
        
      case 9:
        System.out.println("Running colorful edge detection method");
        pic.colorfulEdgeDetection(7.0,50);
        return pic;
        
      case 10:
        System.out.println("Running quatrefoil method");
        pic.quatrefoil();
        return pic;
        
      default:
        System.out.println("Running quatrefoil method");
        pic.quatrefoil();
        return pic;
    } 
  }
  
  public static Turtle turtleStuff(Turtle t){
    //drawABoldSize(Turtle t, Color c, boolean bold, int fontSize)
    t.penUp();
    t.moveTo(350,120);
    
    // Draw name-Myron's
    TurtleAlphabet.drawMBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawYBoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawRBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawOBoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawNBoldSize(t,Color.blue,true,1);
    // Draw apostrophe
    t.penUp();
    t.forward(95);
    t.setHeading(45);
    t.penDown();
    t.forward(10);
    t.penUp();
    t.setHeading(180);
    t.forward(95);
    t.setHeading(0);
    TurtleAlphabet.drawSBoldSize(t,Color.blue,true,1);
    
    // Draw title-Favorites
    t.penUp();
    t.moveTo(281,475);
    TurtleAlphabet.drawFBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawABoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawVBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawOBoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawRBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawIBoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawTBoldSize(t,Color.blue,true,1);
    TurtleAlphabet.drawEBoldSize(t,Color.black,true,1);
    TurtleAlphabet.drawSBoldSize(t,Color.blue,true,1);
    
    // Draw decoration 1 a heart
    t.penUp();
    t.moveTo(300,575);
    t.drawHeart(Color.red);
    
    // Draw decoration 2  a music note
    t.penUp();
    t.moveTo(25,300);
    t.drawMusicNote(Color.BLACK);
    
    // Draw decoration 3 a dollar sign
    t.penUp();
    t.moveTo(1000,120);
    t.penDown();
    t.drawDollarSign(new Color(5,235,13));
    t.penUp();
   
    
    t.hide();
    return t;
  }
}
