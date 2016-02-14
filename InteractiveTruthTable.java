/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class InteractiveTruthTable {
  
  
  public static void main(String[] args) { 
    // getString
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter True or False, cap sensitive");
    String first = scan.nextLine();
    System.out.println("Enter True or False, cap sensitive");
    String second = scan.nextLine();
    System.out.println("Enter True or False, cap sensitive");
    String third = scan.nextLine();
    
    if (first != "True" || first != "False"){
      System.out.println("Error: one of the inputs is not true or false");
      return;
    }
    
    else if (second != "True" || first != "False"){
      System.out.println("Error: one of the inputs is not true or false");
      return;
    }
    
    else if (third != "True" || first != "False"){
      System.out.println("Error: one of the inputs is not true or false");
      return;
    }else{
      
      Boolean x = Boolean.parseBoolean(first);
      Boolean y = Boolean.parseBoolean(second);
      Boolean z =  Boolean.parseBoolean(third);
      
      System.out.println("When the X, Y, Z values are: " + x + " " + y + " " + z + ":");
      System.out.println("the expression X && Y && Z evaluates to: " + (x && y && z));
      System.out.println("the expression X || Y || Z evaluates to: " + (x || y || z));
      System.out.println("the expressions X && Y || Z evaluates to: " + (x && y || z));
      System.out.println("the expression X || Y && Z evaluates to: " + (x || y && z));
      System.out.println("the expression !(X && Y && Z) evaluates to: " + !(x && y && z));
      System.out.println("the expressions !(X || Y || Z) evaluates to: " + !(x || y || z));
    }
    
    /* ADD YOUR CODE HERE */
    
  }
}
