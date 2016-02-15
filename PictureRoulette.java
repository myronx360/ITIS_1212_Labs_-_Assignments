public class PictureRoulette {
  
  public static void main(String[] args) { 
    
    int num = 0;
    
    if (args.length == 0) {
      System.err.println("Missing file name parameter");
      System.exit(0);
    }
    
    if (args.length > 0){ 
      Picture pic = new Picture(args[0]);
      if (args.length == 2){
        
        num = Integer.parseInt(args[1]);
        if (num < 0 || num > 9) {
          System.err.println("Error");
          System.exit(0);
        }
      }else{
        int randNum = (int)(Math.random()*10);
        num = randNum;
        //System.out.println("Number generated is: " + num);
      }
      
      switch(num) {
        case 0:
          pic.blur(6);
          System.out.println("Number generated is: " + num);
          System.out.println("Running blur area method");
          pic.show();
          break;
        case 1:
          pic.crop(pic.getWidth()/3, pic.getHeight()/3, pic.getWidth()/3,pic.getHeight()/3);
          System.out.println("Number generated is: " + num);
          System.out.println("Running crop area method");
          pic.show();
          break;
        case 2:
          pic.horizontalShutters();
          System.out.println("Number generated is: " + num);
          System.out.println("Running horizontal shutters method");
          pic.show();
          break;
        case 3:
          pic.blackOut(100,200,100,200);
          System.out.println("Number generated is: " + num);
          System.out.println("Running black out area method");
          pic.show();
          break;
        case 4:
          pic.verticalShutters();
          System.out.println("Number generated is: " + num);
          System.out.println("Running vertical shutters method");
          pic.show();
          break;
        case 5:
          pic.mirrorHorizontal();
          System.out.println("Number generated is: " + num);
          System.out.println("Running Mirror Horizontal Bottom to Top method");
          pic.show();
          break;
        case 6:
          for (int i = 0; i < 5;i++){
          pic.fade();
        }
          System.out.println("Number generated is: " + num);
          System.out.println("Running fade method");
          pic.show();
          break;
        case 7:
          pic.posterize();
          System.out.println("Number generated is: " + num);
          System.out.println("Running posterize method");
          pic.show();
          break;
        case 8:
          pic.decreaseBlue(0.2);
          System.out.println("Number generated is: " + num);
          System.out.println("Running decrease blue method");
          pic.show();
          break;
        case 9:
          pic.colorfulEdgeDetection(7.0,50);
          System.out.println("Number generated is: " + num);
          System.out.println("Running colorful edge detection method");
          pic.show();
          break;
        default:
          System.err.println("Passed in number is not between 0 and 9");
          break;
      }
    }
  }
}
