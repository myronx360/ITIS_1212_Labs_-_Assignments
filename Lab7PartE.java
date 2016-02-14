public class Lab7PartE {   
  public static void main(String [] args)   
  {     
    // TODO: put your code here to generate a random number between 0 and 20
    // and then print out that many asterisks on a single line.
    
   int randNum =(int)(Math.random() * 20);
   int i = 0;
  
   while (i < randNum) {
     System.out.print("*");
     i++;
   }
//Checks if randNum is odd
   if (randNum % 2 == 1) {
     System.out.println();
     System.out.println(randNum + " asterisks, which is an odd number");
   }
   //Checks if randNum is even
   if (randNum % 2 == 0) {
     System.out.println();
     System.out.println(randNum + " asterisks, which is an even number");
   }
  } 
}  