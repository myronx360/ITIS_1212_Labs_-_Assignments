import java.awt.Color;
public class Lab5PartB
{
  public static void main(String [] args)
  {
    Picture pic = new Picture(FileChooser.pickAFile());
    Turtle tom = new Turtle(pic);
    tom.penUp();
    tom.setPenColor(Color.white);
    tom.moveTo(280, 60);
    tom.setPenWidth(5);
    tom.penDown();
    tom.moveTo(400, 60);
    tom.moveTo(400, 160);
    tom.moveTo(280, 160);
    tom.moveTo(280, 60);
    tom.hide();
    pic.show();
    
  }
}