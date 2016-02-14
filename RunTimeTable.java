/**
 * Auto Generated Java Class.
 */
public class RunTimeTable {
  
  
  public static void main(String[] args) { 
    if (args.length < 3 ) {
      System.out.println("Error: not enough parameters");
      System.exit(0);
    }else{
      // get boolean values from parameters
      Boolean x = Boolean.parseBoolean(args[0]);
      Boolean y = Boolean.parseBoolean(args[1]);
      Boolean z =  Boolean.parseBoolean(args[2]);
      
       System.out.println("When the X, Y, Z values are: " + x + " " + y + " " + z + ":");
      System.out.println("the expression X && Y && Z evaluates to: " + (x && y && z));
      System.out.println("the expression X || Y || Z evaluates to: " + (x || y || z));
      System.out.println("the expressions X && Y || Z evaluates to: " + (x && y || z));
      System.out.println("the expression X || Y && Z evaluates to: " + (x || y && z));
      System.out.println("the expression !(X && Y && Z) evaluates to: " + !(x && y && z));
      System.out.println("the expressions !(X || Y || Z) evaluates to: " + !(x || y || z));
    }
    
  }
}
