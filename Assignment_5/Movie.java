// Myron Williams
import java.awt.Color;
public class Movie {
  
  
  public static void main(String[] args) throws InterruptedException{
    // put pictures into variables   
    Picture worldPic = new Picture(FileChooser.pickAFile()); // Xbox_console
    Picture pic2 = new Picture(FileChooser.pickAFile());    // Xbox_360
    Picture pic3 = new Picture(FileChooser.pickAFile());   // xbox-one
    
    int wait = 800;
    
    // get a world the correct size for the picture
    World w = new World(worldPic.getWidth(),worldPic.getHeight());
    // put the picture in the world
    w.setPicture(worldPic);
    Thread.sleep(wait*3); // pause so you can see the first image appear in the world
    worldPic.mirrorVertical();
    w.modelChanged();
    Thread.sleep(wait*2);
    worldPic.mirrorHorizontal();
    w.modelChanged();
    Thread.sleep(wait*2);
    
    // hides a picture and reveals another picture
    for (int conceal = 0; conceal < 100;conceal++) {
      //(Picture underPic, double divisionWidth, double divisionHeight, int sourcePercent, int targetPercent)
      worldPic.concealLeftToRight(pic2, conceal/100.0, conceal/100.0,30,60);
      w.modelChanged();// update display
    }
    Thread.sleep(wait);
    
    // lighten the picture
    worldPic.lighten2();
    w.modelChanged();
    Thread.sleep(wait*3);
    
    // horizontalShutters(int width, Color c)
    worldPic.horizontalShutters(18, new Color(0,105,0));
    w.modelChanged();
    Thread.sleep(wait);
    //verticalShutters(int width,Color c )
    worldPic.verticalShutters(18, Color.black);
    w.modelChanged();
    Thread.sleep(wait);
    
    // reveal a picture over another picture 
    for (int reveal = 0; reveal < 100;reveal++) {
      //(Picture underPic, double division_Width, int sourcePercent, int targetPercent)
      worldPic.reveal(pic3, reveal/100.0);
      w.modelChanged();// update display
    }
    
    // replaceColor(Color oldColor, Color newColor, int thresold)
    worldPic.replaceColor(Color.white, Color.blue, 255);
    w.modelChanged();
    Thread.sleep(wait*2);
    worldPic.replaceColor(Color.blue, Color.red, 20);
    w.modelChanged();
    Thread.sleep(wait*2);
    worldPic.replaceColor(Color.red, Color.green, 60);
    w.modelChanged();
    Thread.sleep(wait*2);
    worldPic.replaceColor(new Color(0,99,0), Color.black, 200);
    w.modelChanged();
    
    // reveal via checkardboard pattern
    for (int i = 1; i < (worldPic.getWidth()*.5); i+=25){
      //(int width, Picture pic)
      worldPic.checkerboard(i, pic3);
      Thread.sleep(wait*2);
      w.modelChanged();
    }
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
