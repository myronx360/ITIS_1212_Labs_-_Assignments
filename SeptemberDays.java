/**
 * Auto Generated Java Class.
 */
public class SeptemberDays {
  
  
  public static void main(String[] args) { 
    int days = 0;
   
    if (args.length == 0){
      System.out.println("Error!: No number passed in");
      System.exit(0);
    }
     days = Integer.parseInt(args[0]);
    switch (days){
      case 1: case 8: case 15: case 22: case 29:
        System.out.println("September" + days + "is a Monday");
        break;
        
      case 2: case 9: case 16: case 23: case 30:
        System.out.println("September" + days + "is a Tuesday");
        break;
        
      case 3: case 10: case 17: case 24:
        System.out.println("September " + days + " is a Wenesday");
        break;
        
      case 4: case 11: case 18:  case 25:
        System.out.println("September " + days + " is a Thursday");
        break;
        
      case 5: case 12: case 19: case 26:
        System.out.println("September " + days + " is a Friday");
        break;
        
      case 6: case 13: case 20: case 27:
        System.out.println("September " + days + " is a Saturday");
        break;
        
      case 7: case 14: case 21: case 28:
        System.out.println("September " + days + " is a Sunday");
        break;
        
      default:
        System.out.println("Invalid date in September.");
        break;
    }
    
    /* ADD YOUR CODE HERE */
    
  }
}
