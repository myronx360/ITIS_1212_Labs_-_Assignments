/**
 * Computes sells price with tax for given product 
 */
import java.util.Scanner;
public class Lab5PartE {
  
  
  public static void main(String[] args) { 
    System.out.println("Enter original price");
    System.out.println("Enter discount percentage as decimal");
    
    
    Scanner keyboard = new Scanner(System.in);
   
    double originalPrice = keyboard.nextInt();
    double discoutPercent = keyboard.nextDouble();
    double saleTax;
    double salePrice;
    double finalPrice;
    
   
    salePrice = originalPrice - (originalPrice * discoutPercent);
    saleTax = (salePrice * .06);
    finalPrice = salePrice + saleTax;
 
      
    
    
    
    
    System.out.println("original price: " + originalPrice);
    System.out.println("discount percentage: " + discoutPercent);
    System.out.println("sale tax: " + saleTax);
    System.out.println("final price: " + finalPrice);
  }
  
  /* ADD YOUR CODE HERE */
  
}
