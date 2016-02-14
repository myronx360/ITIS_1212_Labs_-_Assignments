/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class Lab5PartF2 {
  
  
  public static void main(String[] args) { 
     Scanner keyboard = new Scanner(System.in);
    System.out.println("How many of type 1 candle a in whole numbers");
    System.out.println("How many of each candle in whole numbers");
    System.out.println("How many of each candle in whole numbers");
    
     int numCandles = keyboard.nextInt();
     double type1 = 2.50;
     double type2 = 3.75;
     double type3 = 5.99;
     int type1Burn = 5;
     int type2Burn = 7;
     int type3Burn = 12;
     double totalPrice = numCandles * (type1 + type2 + type3); 
     int totalBurn = numCandles * (type1Burn + type2Burn + type3Burn);
     
     System.out.println("Cost per minute: ");
     System.out.println("Totol Burn Time: ");
     
     
    
   
     
           
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
