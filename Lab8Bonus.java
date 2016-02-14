/* Lab 8, Part E: Created by Celine Latulipe  */  
public class Lab8Bonus {   
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
    Picture copyOfFirstPic = new Picture(pic);
    double index = 0.0;
    double d = 0.0;
    double e = 0.0;
    int z = 1;
    
    while (z >0){
      if (z == 1){
        index = 0.0;
        for (int i = 0;i<25;i++){
          // call average pixels method
          pic.weightedAverageWithSource(source, index);
          // update world so we can see the change
          w.modelChanged();
          index = index + 0.02;
        }
        z++;
      }
      if (z == 2){
        d = 0.0;
        for (int i = 0;i<25;i++){
          // call average pixels method
          pic.weightedAverageWithSource(copyOfFirstPic, d);
          // update world so we can see the change
          w.modelChanged();
          d = d + 0.02;
          System.out.println(d); 
        }
        z++;
      }
      if (z == 3){
        e = 0.0;
        for (int i = 0;i<25;i++){
          // call average pixels method
          pic.weightedAverageWithSource(source, e);
          // update world so we can see the change
          w.modelChanged();
          e = e + 0.02;
        }
        z = 1;
      }
    } 
  } 
}  