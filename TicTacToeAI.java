/**
 * Auto Generated Java Class.
 * 
 * Authors:  Cody Searchfield
 *           Hussain Alabdulmuhsin
 *           Joseph Samson
 *           Myron Williams
 */

import java.util.*;
import java.awt.*;

public class TicTacToeAI {
  
  //Globals
  private static  final int WORLD_WIDTH = 400;
  private static final int WORLD_HEIGHT = 400;
  
  private static boolean valid = false;
  
  private static final int h1StartX = (int)(WORLD_WIDTH * 0.20), h1StartY = (int)(WORLD_HEIGHT * 0.40),
    h1EndX = (int)(WORLD_WIDTH * 0.80), h1EndY = (int)(WORLD_HEIGHT * 0.40),
    h2StartX = (int)(WORLD_WIDTH * 0.20), h2StartY = (int)(WORLD_HEIGHT * 0.60),
    h2EndX = (int)(WORLD_WIDTH * 0.80), h2EndY = (int)(WORLD_HEIGHT * 0.60),
    v1StartX = (int)(WORLD_WIDTH * 0.40), v1StartY = (int)(WORLD_HEIGHT * 0.20),
    v1EndX = (int)(WORLD_WIDTH * 0.40), v1EndY = (int)(WORLD_HEIGHT * 0.80),
    v2StartX = (int)(WORLD_WIDTH * 0.60), v2StartY = (int)(WORLD_HEIGHT * 0.20),
    v2EndX = (int)(WORLD_WIDTH * 0.60), v2EndY = (int)(WORLD_HEIGHT * 0.80);
  
  private static final int box0X = (int)(WORLD_WIDTH * 0.30), box0Y = (int)(WORLD_HEIGHT * 0.40),
    box1X = (int)(WORLD_WIDTH * 0.50), box1Y = (int)(WORLD_HEIGHT * 0.40),
    box2X = (int)(WORLD_WIDTH * 0.70), box2Y = (int)(WORLD_HEIGHT * 0.40),
    box3X = (int)(WORLD_WIDTH * 0.30), box3Y = (int)(WORLD_HEIGHT * 0.60),
    box4X = (int)(WORLD_WIDTH * 0.50), box4Y = (int)(WORLD_HEIGHT * 0.60),
    box5X = (int)(WORLD_WIDTH * 0.70), box5Y = (int)(WORLD_HEIGHT * 0.60),
    box6X = (int)(WORLD_WIDTH * 0.30), box6Y = (int)(WORLD_HEIGHT * 0.80),
    box7X = (int)(WORLD_WIDTH * 0.50), box7Y = (int)(WORLD_HEIGHT * 0.80),
    box8X = (int)(WORLD_WIDTH * 0.70), box8Y = (int)(WORLD_HEIGHT * 0.80);
  
  private static boolean winnerFound = false;
  private static int[][] boxesTaken = new int[3][3];
  //Create a world
  private static World w = new World(WORLD_WIDTH, WORLD_HEIGHT);
  
  //Create turtles
  private static Turtle t = new Turtle(h1StartX, h1StartY, w);
  private static Turtle comp = new Turtle(w);
  
  //Begin main method.
  public static void main(String[] args) throws InterruptedException
  { 
    //Instantiate Scanner object
    Scanner kb = new Scanner(System.in);
    
    //Determine who goes first... 0 = human, 1 = computer.
    int first = (int)(Math.random() * 2);
    int compChoice = 0;
    int winner = 0;
    
    t.hide();
    comp.hide();
    
    //Draw the grid
    t.setPenColor(Color.black);
    t.moveTo(h1EndX, h1EndY); //draw h1
    t.penUp();
    t.moveTo(v1StartX, v1StartY);
    t.penDown();
    t.moveTo(v1EndX, v1EndY); //draw v1
    t.penUp();
    t.moveTo(v2StartX, v2StartY);
    t.penDown();
    t.moveTo(v2EndX, v2EndY); //draw v2
    t.penUp();
    t.moveTo(h2StartX, h2StartY);
    t.penDown();
    t.moveTo(h2EndX, h2EndY); //draw h2
    t.penUp();
    t.setPenColor(Color.red);
    
    int userChoice = 0;
    
    //if human goes first
    if (first == 0)
    {
      //This is the game loop
      while (!winnerFound)
      {
        valid = false;
        while (!valid)
        {
          try
          {
            //Ask the player where they would like to place their X
            System.out.println("Where do you want your X?  Open spots:  " + checkOpenSpots());
            userChoice = kb.nextInt();
            kb.nextLine();
            //Make sure it is a valid choice
            if ( (validateChoice(userChoice)) 
                  && 
                (userChoice >= 0 && userChoice <= 8) )
              valid = true;
          }
          catch (InputMismatchException e)
          {
            System.out.println("Error:  Enter the number of the box in which you'd like to place your X.\n");
            kb.nextLine();
          }
        } //end while (!valid)
        
        //At this point, we know that the value stored in userChoice is valid.
        //Pick up the pen and move to that box.
        t.penUp();
        switch (userChoice)
        {
          case 0:
            t.moveTo(box0X, box0Y);
            boxesTaken[0][0] = 1;
            break;
            
          case 1:
            t.moveTo(box1X, box1Y);
            boxesTaken[0][1] = 1;
            break;
            
          case 2:
            t.moveTo(box2X, box2Y);
            boxesTaken[0][2] = 1;
            break;
            
          case 3:
            t.moveTo(box3X, box3Y);
            boxesTaken[1][0] = 1;
            break;
            
          case 4:
            t.moveTo(box4X, box4Y);
            boxesTaken[1][1] = 1;
            break;
            
          case 5:
            t.moveTo(box5X, box5Y);
            boxesTaken[1][2] = 1;
            break;
            
          case 6:
            t.moveTo(box6X, box6Y);
            boxesTaken[2][0] = 1;
            break;
            
          case 7:
            t.moveTo(box7X, box7Y);
            boxesTaken[2][1] = 1;
            break;
            
          case 8:
            t.moveTo(box8X, box8Y);
            boxesTaken[2][2] = 1;
            break;
            
          default:  System.out.println("Error:  You did not enter a valid choice.\n");
        }
        
        t.drawXTTT((int) (WORLD_WIDTH * 0.90));
        
        //Check for a winner.
        winner = checkForWinner();
        if (winner == 1)
        {
          System.out.println("Congratulations!  You win!");
          break;          
        }
        if (winner == 2)
        {
          System.out.println("Sorry!  You lose!");
          break;          
        }
        if (winner == 3)
        {
          System.out.println("Sorry, no winner.  It was a draw!");
          winnerFound = true;
          break;
        }
        
        if (!winnerFound)
        {
          //At this point it is the computers turn.
          computerMark();
          //Check for a winner after the computer's turn
          winner = checkForWinner();
          if (winner == 1)
          {
            System.out.println("Congratulations!  You win!");
            break;          
          }
          if (winner == 2)
          {
            System.out.println("Sorry!  You lose!");
            break;          
          }
          if (winner == 3)
          {
            System.out.println("Sorry, no winner.  It was a draw!");
            winnerFound = true;
            break;
          }
        } //end if(!winnerFound)
        
      } //end while (!winnerFound)... game loop
    } //end if(first == 0)- human goes first
    
    else //The computer goes first
    {
      //This is the game loop
      while(!winnerFound)
      {
        //At this point it is the computers turn.
        computerMark();
        
        //Check for a winner after the computer's turn
        winner = checkForWinner();
        if (winner == 1)
        {
          System.out.println("Congratulations!  You win!");
          break;
        }
        if (winner == 2)
        {
          System.out.println("Sorry!  You lose!");
          break;
        }
        if (winner == 3)
        {
          System.out.println("Sorry, no winner.  It was a draw!");
          winnerFound = true;
          break;
        }
        
        if (!winnerFound)
        {
          //Now it's the human's turn
          valid = false;
          while (!valid)
          {
            try
            {
              //Ask the player where they would like to place their X
              System.out.println("Where do you want your X?  Open spots:  " + checkOpenSpots());
              userChoice = kb.nextInt();
              kb.nextLine();
              //Make sure it is a valid choice
              if ( (validateChoice(userChoice)) 
                    && 
                  (userChoice >= 0 && userChoice <= 8) )
                valid = true;
            }
            catch (InputMismatchException e)
            {
              System.out.println("Error:  Enter the number of the box in which you'd like to place your X.\n");
              kb.nextLine();
            }
          } //end while (!valid)
          
          //At this point, we know that the value stored in userChoice is valid.
          //Pick up the pen and move to that box.
          t.penUp();
          switch (userChoice)
          {
            case 0:
              t.moveTo(box0X, box0Y);
              boxesTaken[0][0] = 1;
              break;
              
            case 1:
              t.moveTo(box1X, box1Y);
              boxesTaken[0][1] = 1;
              break;
              
            case 2:
              t.moveTo(box2X, box2Y);
              boxesTaken[0][2] = 1;
              break;
              
            case 3:
              t.moveTo(box3X, box3Y);
              boxesTaken[1][0] = 1;
              break;
              
            case 4:
              t.moveTo(box4X, box4Y);
              boxesTaken[1][1] = 1;
              break;
              
            case 5:
              t.moveTo(box5X, box5Y);
              boxesTaken[1][2] = 1;
              break;
              
            case 6:
              t.moveTo(box6X, box6Y);
              boxesTaken[2][0] = 1;
              break;
              
            case 7:
              t.moveTo(box7X, box7Y);
              boxesTaken[2][1] = 1;
              break;
              
            case 8:
              t.moveTo(box8X, box8Y);
              boxesTaken[2][2] = 1;
              break;
              
            default:  System.out.println("Error:  You did not enter a valid choice.\n");
          } //end switch(userChoice)
          
          t.drawXTTT((int) (WORLD_WIDTH * 0.90));
          
          //Check for a winner.
          winner = checkForWinner();
          if (winner == 1)
          {
            System.out.println("Congratulations!  You win!");
            break;
          }
          if (winner == 2)
          {
            System.out.println("Sorry!  You lose!");
            break;
          }
          if (winner == 3)
          {
            System.out.println("Sorry, no winner.  It was a draw!");
            winnerFound = true;
            break;
          }
        } //end if (!winnerFound)
      } //end while (!winnerFound)... game loop
    } //end else statement... computer goes first
    
  } //end main method
  
  public static void computerMark()
  {
    int compChoice = 0;
    
    //At this point it is the computers turn.
    
    /////////////////////////////////////////////////////////////////////////
    
    //Offense
    
    //Boxes 0&1 = 2
    if (boxesTaken[0][0] == 2 && boxesTaken[0][1] == 2 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 0&3 = 6
    else if (boxesTaken[0][0] == 2 && boxesTaken[1][0] == 2 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 0&2 = 1
    else if (boxesTaken[0][0] == 2 && boxesTaken[0][2] == 2 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 0&6 = 3
    else if (boxesTaken[0][0] == 2 && boxesTaken[2][0] == 2 && boxesTaken[1][0] == 0)
    {
      compChoice = 3;
    }
    
    //Boxes 2&1 = 0
    else if (boxesTaken[0][2] == 2 && boxesTaken[0][1] == 2 && boxesTaken[0][0] == 0)
    {
      compChoice = 0;
    }
    
    //Boxes 2&5 = 8
    else if (boxesTaken[0][2] == 2 && boxesTaken[1][2] == 2 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 2&8 = 5
    else if (boxesTaken[0][2] == 2 && boxesTaken[2][2] == 2 && boxesTaken[1][2] == 0)
    {
      compChoice = 5;
    }
    
    //Boxes 2&4 = 6
    else if (boxesTaken[0][2] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 0&4 = 8
    else if (boxesTaken[0][0] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 8&5 = 2
    else if (boxesTaken[2][2] == 2 && boxesTaken[1][2] == 2 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 8&7 = 6
    else if (boxesTaken[2][2] == 2 && boxesTaken[2][1] == 2 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 8&6 = 7
    else if (boxesTaken[2][2] == 2 && boxesTaken[2][0] == 2 && boxesTaken[2][1] == 0)
    {
      compChoice = 7;
    }
    
    //Boxes 6&7 = 8
    else if (boxesTaken[2][0] == 2 && boxesTaken[2][1] == 2 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 6&3 = 1
    else if (boxesTaken[2][0] == 2 && boxesTaken[1][0] == 2 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 4&6 = 2
    else if (boxesTaken[1][1] == 2 && boxesTaken[2][0] == 2 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 4&8 = 0
    else if (boxesTaken[1][1] == 2 && boxesTaken[2][2] == 2 && boxesTaken[0][0] == 0)
    {
      compChoice = 0;
    }
    
    //Boxes 1&4 = 7
    else if (boxesTaken[0][1] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][1] == 0)
    {
      compChoice = 7;
    }
    
    //Boxes 4&5 = 3
    else if (boxesTaken[1][1] == 2 && boxesTaken[1][2] == 2 && boxesTaken[1][0] == 0)
    {
      compChoice = 3;
    }
    
    //Boxes 4&7 = 1
    else if (boxesTaken[1][1] == 2 && boxesTaken[2][1] == 2 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 3&4 = 5
    else if (boxesTaken[1][0] == 2 && boxesTaken[1][1] == 2 && boxesTaken[1][2] == 0)
    {
      compChoice = 5;
    }
    
    //Boxes 2&6 = 4
    else if (boxesTaken[0][2] == 2 && boxesTaken[2][0] == 2 && boxesTaken[1][1] == 0)
    {
      compChoice = 4;
    }
    
    //Boxes 0&8 = 4
    else if (boxesTaken[0][0] == 2 && boxesTaken[2][2] == 2 && boxesTaken[1][1] == 0)
    {
      compChoice = 4;
    }
    
    //end offensive moves
    
    /////////////////////////////////////////////////////////////////////////
    
    //Defense
    
    //Boxes 0&1 = 2
    else if (boxesTaken[0][0] == 1 && boxesTaken[0][1] == 1 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 0&3 = 6
    else if (boxesTaken[0][0] == 1 && boxesTaken[1][0] == 1 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 0&2 = 1
    else if (boxesTaken[0][0] == 1 && boxesTaken[0][2] == 1 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 0&6 = 3
    else if (boxesTaken[0][0] == 1 && boxesTaken[2][0] == 1 && boxesTaken[1][0] == 0)
    {
      compChoice = 3;
    }
    
    //Boxes 2&1 = 0
    else if (boxesTaken[0][2] == 1 && boxesTaken[0][1] == 1 && boxesTaken[0][0] == 0)
    {
      compChoice = 0;
    }
    
    //Boxes 2&5 = 8
    else if (boxesTaken[0][2] == 1 && boxesTaken[1][2] == 1 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 2&8 = 5
    else if (boxesTaken[0][2] == 1 && boxesTaken[2][2] == 1 && boxesTaken[1][2] == 0)
    {
      compChoice = 5;
    }
    
    //Boxes 2&4 = 6
    else if (boxesTaken[0][2] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 0&4 = 8
    else if (boxesTaken[0][0] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 8&5 = 2
    else if (boxesTaken[2][2] == 1 && boxesTaken[1][2] == 1 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 8&7 = 6
    else if (boxesTaken[2][2] == 1 && boxesTaken[2][1] == 1 && boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Boxes 8&6 = 7
    else if (boxesTaken[2][2] == 1 && boxesTaken[2][0] == 1 && boxesTaken[2][1] == 0)
    {
      compChoice = 7;
    }
    
    //Boxes 6&7 = 8
    else if (boxesTaken[2][0] == 1 && boxesTaken[2][1] == 1 && boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    //Boxes 6&3 = 1
    else if (boxesTaken[2][0] == 1 && boxesTaken[1][0] == 1 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 4&6 = 2
    else if (boxesTaken[1][1] == 1 && boxesTaken[2][0] == 1 && boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Boxes 4&8 = 0
    else if (boxesTaken[1][1] == 1 && boxesTaken[2][2] == 1 && boxesTaken[0][0] == 0)
    {
      compChoice = 0;
    }
    
    //Boxes 1&4 = 7
    else if (boxesTaken[0][1] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][1] == 0)
    {
      compChoice = 7;
    }
    
    //Boxes 4&5 = 3
    else if (boxesTaken[1][1] == 1 && boxesTaken[1][2] == 1 && boxesTaken[1][0] == 0)
    {
      compChoice = 3;
    }
    
    //Boxes 4&7 = 1
    else if (boxesTaken[1][1] == 1 && boxesTaken[2][1] == 1 && boxesTaken[0][1] == 0)
    {
      compChoice = 1;
    }
    
    //Boxes 3&4 = 5
    else if (boxesTaken[1][0] == 1 && boxesTaken[1][1] == 1 && boxesTaken[1][2] == 0)
    {
      compChoice = 5;
    }
    
    //Boxes 2&6 = 4
    else if (boxesTaken[0][2] == 1 && boxesTaken[2][0] == 1 && boxesTaken[1][1] == 0)
    {
      compChoice = 4;
    }
    
    //Boxes 0&8 = 4
    else if (boxesTaken[0][0] == 1 && boxesTaken[2][2] == 1 && boxesTaken[1][1] == 0)
    {
      compChoice = 4;
    }
    
//end defensive moves
    
    /////////////////////////////////////////////////////////////////////////
    
    //Check all 4 corners:  if == 0, mark that spot
    //Box 0
    else if (boxesTaken[0][0] == 0)
    {
      compChoice = 0;
    }
    
    //Box 2
    else if (boxesTaken[0][2] == 0)
    {
      compChoice = 2;
    }
    
    //Box 6
    else if (boxesTaken[2][0] == 0)
    {
      compChoice = 6;
    }
    
    //Box 8
    else if (boxesTaken[2][2] == 0)
    {
      compChoice = 8;
    }
    
    /////////////////////////////////////////////////////////////////////////
    else
    {
      //Generate random number for the computer
      valid = false;
      while (!valid)
      {
        compChoice = (int)(Math.random() * 9);
        
        //Make sure it is a valid choice
        if ( (validateChoice(compChoice)) 
              && 
            (compChoice >= 0 && compChoice <= 8) )
          valid = true;
      } //end while (!valid)
    }
    
    /////////////////////////////////////////////////////////////////////////
    
    
    //Make sure that the comp turtle pen is up before moving to box
    comp.penUp();
    
    //Move the computer to the chosen box and mark that box as taken.
    switch (compChoice)
    {
      case 0:
        comp.moveTo(box0X, box0Y);
        boxesTaken[0][0] = 2;
        break;
        
      case 1:
        comp.moveTo(box1X, box1Y);
        boxesTaken[0][1] = 2;
        break;
        
      case 2:
        comp.moveTo(box2X, box2Y);
        boxesTaken[0][2] = 2;
        break;
        
      case 3:
        comp.moveTo(box3X, box3Y);
        boxesTaken[1][0] = 2;
        break;
        
      case 4:
        comp.moveTo(box4X, box4Y);
        boxesTaken[1][1] = 2;
        break;
        
      case 5:
        comp.moveTo(box5X, box5Y);
        boxesTaken[1][2] = 2;
        break;
        
      case 6:
        comp.moveTo(box6X, box6Y);
        boxesTaken[2][0] = 2;
        break;
        
      case 7:
        comp.moveTo(box7X, box7Y);
        boxesTaken[2][1] = 2;
        break;
        
      case 8:
        comp.moveTo(box8X, box8Y);
        boxesTaken[2][2] = 2;
        break;
        
      default:  System.out.println("Error:  You did not enter a valid choice.\n");
    }
    
    //Mark the chosen box.
    comp.drawOctagonTTT((int)(WORLD_WIDTH * 0.9));
  }
  //end computerMark() method.
  
  public static int checkForWinner() throws InterruptedException
  {
    int result = 0;
    
    //First time using a named break.
    //Loop through the 2D array and check against known winning conditions
    A:  for (int i = 0; i < boxesTaken.length; i++)
    {
      for (int j = 0; j < boxesTaken[i].length; j++)
      {
        //Check if human won
        if(boxesTaken[0][0] == 1 && boxesTaken[0][1] == 1 && boxesTaken[0][2] == 1) // top
        {
          result = 1;
          winnerFound = true;          
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .3));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .3),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .3));
          break A;
        }
        
        if(boxesTaken[2][0] == 1 && boxesTaken[2][1] == 1 && boxesTaken[2][2] == 1)  // bottom
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .7));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .7),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .7));
          break A;
        }
        
        if(boxesTaken[0][0] == 1 && boxesTaken[1][0] == 1 && boxesTaken[2][0] == 1) // left
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo(box6X, box6Y);
          animateLine(t, 0, box6X, box6Y, (int)(WORLD_WIDTH * .3), (int)(WORLD_HEIGHT * .2));
          break A;
        }
        
        if(boxesTaken[0][2] == 1 && boxesTaken[1][2] == 1 && boxesTaken[2][2] == 1) // right
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo(box8X, box8Y);
          animateLine(t, 0, box8X, box8Y, (int)(WORLD_WIDTH * .7), (int)(WORLD_HEIGHT * .2));
          break A;
        }
        
        if(boxesTaken[0][0] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][2] == 1) // diagonally 1
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.2));
          animateLine(t, (90+45), (int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.2), 
                      (int)(WORLD_WIDTH * 0.80), (int)(WORLD_HEIGHT * 0.8));
          break A;
        }
        
        if(boxesTaken[0][2] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][0] == 1) // diagonally 2
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.8));
          animateLine(t, 45, (int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.8),
                      (int)(WORLD_WIDTH * 0.80), (int)(WORLD_HEIGHT * 0.2));
          break A;
        }
        
        if(boxesTaken[1][0] == 1 && boxesTaken[1][1] == 1 && boxesTaken[1][2] == 1) // center horizontally
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .5));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .5),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .5));
          break A;
        }
        
        if(boxesTaken[0][1] == 1 && boxesTaken[1][1] == 1 && boxesTaken[2][1] == 1) //center vertically
        {
          result = 1;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .2));
          animateLine(t, 180, (int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .2),
                      (int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .8));
          break A;
        }
        
        //Check if computer won
        if(boxesTaken[0][0] == 2 && boxesTaken[0][1] == 2 && boxesTaken[0][2] == 2) // top
        {
          result = 2;
          winnerFound = true;          
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .3));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .3),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .3));
          break A;
        }
        
        if(boxesTaken[2][0] == 2 && boxesTaken[2][1] == 2 && boxesTaken[2][2] == 2)  // bottom
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .7));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .7),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .7));
          break A;
        }
        
        if(boxesTaken[0][0] == 2 && boxesTaken[1][0] == 2 && boxesTaken[2][0] == 2) // left
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo(box6X, box6Y);
          animateLine(t, 0, box6X, box6Y, (int)(WORLD_WIDTH * .3), (int)(WORLD_HEIGHT * .2));
          break A;
        }
        
        if(boxesTaken[0][2] == 2 && boxesTaken[1][2] == 2 && boxesTaken[2][2] == 2) // right
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo(box8X, box8Y);
          animateLine(t, 0, box8X, box8Y, (int)(WORLD_WIDTH * .7), (int)(WORLD_HEIGHT * .2));
          break A;
        }
        
        if(boxesTaken[0][0] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][2] == 2) // diagonally 1
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.2));
          animateLine(t, (90+45), (int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.2), 
                      (int)(WORLD_WIDTH * 0.80), (int)(WORLD_HEIGHT * 0.8));
          break A;
        }
        
        if(boxesTaken[0][2] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][0] == 2) // diagonally 2
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.8));
          animateLine(t, 45, (int)(WORLD_WIDTH * 0.20), (int)(WORLD_HEIGHT * 0.8),
                      (int)(WORLD_WIDTH * 0.80), (int)(WORLD_HEIGHT * 0.2));
          break A;
        }
        
        if(boxesTaken[1][0] == 2 && boxesTaken[1][1] == 2 && boxesTaken[1][2] == 2) // center horizontally
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .5));
          animateLine(t, 90, (int)(WORLD_WIDTH * .2), (int)(WORLD_HEIGHT * .5),
                      (int)(WORLD_WIDTH * .8), (int)(WORLD_HEIGHT * .5));
          break A;
        }
        
        if(boxesTaken[0][1] == 2 && boxesTaken[1][1] == 2 && boxesTaken[2][1] == 2) //center vertically
        {
          result = 2;
          winnerFound = true;
          t.penUp();
          t.moveTo((int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .2));
          animateLine(t, 180, (int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .2),
                      (int)(WORLD_WIDTH * .5), (int)(WORLD_HEIGHT * .8));
          break A;
        }
        
        if ( boxesTaken[0][0] != 0 && 
            boxesTaken[0][1] != 0 && 
            boxesTaken[0][2] != 0 && 
            boxesTaken[1][0] != 0 && 
            boxesTaken[1][1] != 0 && 
            boxesTaken[1][2] != 0 && 
            boxesTaken[2][0] != 0 && 
            boxesTaken[2][1] != 0 && 
            boxesTaken[2][2] != 0 && 
            result != 1 &&
            result != 2)
          result = 3;
      } //end inner for-loop
    } //end outer for-loop
    return result;
  }
  // End checkForWinner() method.
  
  public static String checkOpenSpots()
  {
    String s = "";
    int counter = 0;
    
    for (int i = 0; i < boxesTaken.length; i++)
    {
      for (int j = 0; j < boxesTaken[i].length; j++)
      {
        if (boxesTaken[i][j] == 0)
          s = s + counter + ", ";
        counter++;
      }
    }
    
    return s;
  }
  // End checkOpenSpots() method.
  
  public static boolean validateChoice(int choice)
  {
    //Make sure it is a valid choice
    switch(choice)
    {
      case 0:
        if (boxesTaken[0][0] != 0)
      {
        return false;
      }
        break;
        
      case 1:
        if (boxesTaken[0][1] != 0)
      {
        return false;
      }
        break;
        
      case 2:
        if (boxesTaken[0][2] != 0)
      {
        return false;
      }
        break;
        
      case 3:
        if (boxesTaken[1][0] != 0)
      {
        return false;
      }
        break;
        
      case 4:
        if (boxesTaken[1][1] != 0)
      {
        return false;
      }
        break;
        
      case 5:
        if (boxesTaken[1][2] != 0)
      {
        return false;
      }
        break;
        
      case 6:
        if (boxesTaken[2][0] != 0)
      {
        return false;
      }
        break;
        
      case 7:
        if (boxesTaken[2][1] != 0)
      {
        return false;
      }
        break;
        
      case 8:
        if (boxesTaken[2][2] != 0)
      {
        return false;
      }
        break;
    } //end switch statement
    return true;
  } //end validateChoice() method.
  
  /*
   * This method animates the turtle drawing the winning line
   */
  public static void animateLine(Turtle tom,
                                 int heading,
                                 int startX,
                                 int startY,
                                 int endX,
                                 int endY) throws InterruptedException
  {
    //setup to draw a line through the winning col/row/diagonal
    tom.show();
    tom.penUp();
    tom.setHeading(heading);
    tom.penDown();
    tom.setPenWidth(4);
    tom.setPenColor(Color.black);
    int dist = (int) (Math.sqrt( ((startX - endX) * (startX - endX)) + 
                                ((startY - endY) * (startY - endY)) ));
    //animate drawing the line
    for (int i = 0; i < (dist / 3); i++)
    {
      tom.forward(3);
      Thread.sleep(30);
    }
  } //end animateLine() method.
  
} //end class TicTacToeAI