/* Practicing basic algorithms.  Part of Lab 5 */
/* Use modulus operator                        */
import java.util.Scanner;

public class Lab5PartD
{
  public static void main(String [] args) 
  {
      // Prompt user to enter number of days of vacation taken as an integer
      System.out.println("enter number of  vacation days");
      
      // Accept data from user
      Scanner keyboard = new Scanner(System.in);
      // Convert string entered to ...
      int daysVacation = keyboard.nextInt();

      // Perform necessary calculations.  Replace =0 below with the proper calculation.
      int weeks= daysVacation/7 ;
      int days= daysVacation%7;
      
      // Display results
      System.out.println(" weeks of vacation " + weeks + " days of vacation " + days );
  }
}