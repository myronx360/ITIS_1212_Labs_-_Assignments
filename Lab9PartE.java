/**
 * Auto Generated Java Class.
 */
public class Lab9PartE {
  
  public static void main(String[] args) { 
    for(int x = 1; x <13; x++){
      for(int y = 1; y <13; y++){
        if(x == y){
          System.out.print((x * y) + "*");
        }else{
          System.out.print((x * y));
        }
        System.out.print("\t");
      }
      System.out.println();
    }
  }
}

