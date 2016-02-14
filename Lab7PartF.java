/* Lab 7, Part F: Created by Myron Williams  */  
public class Lab7PartF {   
  public static void main(String [] args)   
  {     
    // TODO: put your code here to print out the alphabet
    char letter = 97;
    while (letter < 123) {
      //checks if letter = a == 97, e == 101, i == 105, o == 111, u == 117 
      //and changes the letter to capital and then prints letter and then changes that 
      //to lower case
      if (letter == 97){letter = 65;System.out.print(letter);letter = 97;letter++;} 
      if (letter == 101){letter = 69;System.out.print(letter);letter = 101;letter++;}
      if (letter == 105){letter = 73;System.out.print(letter);letter = 105;letter++;}
      if (letter == 111){letter = 79;System.out.print(letter);letter = 111;letter++;}
      if (letter == 117){letter = 85;System.out.print(letter);letter = 117;letter++;}
      System.out.print(letter);
      letter++;
    }
    System.out.println();
  } 
}  