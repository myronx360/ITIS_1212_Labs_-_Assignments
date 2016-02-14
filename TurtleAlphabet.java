import java.awt.Color;

// Alphabet methods adpated for Assignment 2 courtesy of Leslie Brown

public class TurtleAlphabet {
  
  
  public static void drawABoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw left line of A
    t.turn(20);
    t.forward(100 * fontSize);
    
    //draw right line
    t.turn(140);
    t.forward(100 * fontSize);
    
    //draw middle
    t.backward(50 * fontSize);
    t.setHeading(-90);
    t.forward(34 * fontSize);
    
    //return to bottom left
    t.backward(34 * fontSize);
    t.setHeading(160);
    t.forward(50 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  
  
  public static void drawBBoldSize(Turtle t,Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of B
    t.forward(100 * fontSize);
    
    //draw top curve
    t.turn(90);
    int length = (8 * fontSize);
    int angle = 5;
    for(int loop = 1; loop < 5; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    int angle2 = 20;
    for(int loop = 1; loop < 8; loop = (loop + 1)) {
      t.turn(angle2);
      t.forward(length);
    }
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw bottom curve
    t.setHeading(90);
    for(int loop = 1; loop < 5; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    int angle3 = 16;
    for(int loop = 1; loop < 10; loop = (loop + 1)) {
      t.turn(angle3);
      t.forward(length);
    }
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(50 * fontSize);
    t.turnLeft();
  }
  
  public static void drawCBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top-ish right of C area
    t.forward(80 * fontSize);
    t.turn(90);
    t.forward(70 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw top of C
    int length = (10 * fontSize);
    int angle = -15;
    t.setHeading(-30);
    for(int loop = 1; loop < 11; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw mid-left
    t.forward(20 * fontSize);
    
    //draw bottom
    for(int loop2 = 1; loop2 < 10; loop2 = (loop2 + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //return to bottom left of letter area
    t.penUp();
    t.setHeading(180);
    t.forward(15 * fontSize);
    
    //move to new letter staring poistion and face north
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawDBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of D
    t.forward(100 * fontSize);
    
    //draw curve
    t.turn(90);
    int length = (10 * fontSize);
    int angle = 3;
    for(int loop = 1; loop < 5; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    int angle2 = 11;
    for(int loop = 1; loop < 15; loop = (loop + 1)) {
      t.turn(angle2);
      t.forward(length);
    }
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(80 * fontSize);
    t.turnLeft();
  }
  
  public static void drawEBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of E
    t.forward(100 * fontSize);
    
    //draw top of E
    t.turnRight();
    t.forward(70 * fontSize);
    
    //draw middle and bottom
    for(int loop = 1; loop < 3; loop = (loop + 1)) {
    t.backward(70 * fontSize);
    t.turnRight();
    t.forward(50 * fontSize);
    t.turnLeft();
    t.forward(70 * fontSize);
    }
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawFBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of F
    t.forward(100 * fontSize);
    
    //draw top
    t.turnRight();
    t.forward(70 * fontSize);
    
    //draw middle
    t.backward(70 * fontSize);
    t.turnRight();
    t.forward(50 * fontSize);
    t.turnLeft();
    t.forward(70 * fontSize);
    
    //move to new letter staring poistion and face north
    t.backward(70 * fontSize);
    t.turnRight();
    t.forward(50 * fontSize);
    t.turnLeft();
    t.penUp();
    t.forward(80 * fontSize);
    t.turnLeft();
  }
  
  public static void drawGBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top-ish right of G area
    t.forward(80 * fontSize);
    t.turn(90);
    t.forward(80 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw top of G
    int length = (10 * fontSize);
    int angle = -15;
    t.setHeading(-30);
    for(int loop = 1; loop < 11; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw mid-left
    t.forward(20 * fontSize);
    
    //draw bottom
    for(int loop2 = 1; loop2 < 10; loop2 = (loop2 + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw the thing a C doesn't have
    t.setHeading(0);
    t.forward(20 * fontSize);
    t.turnLeft();
    t.forward(20 * fontSize);
    
    //return to bottom left of letter area
    t.backward(20 * fontSize);
    t.turnRight();
    t.backward(20 * fontSize);
    t.penUp();
    t.setHeading(180);
    t.forward(15 * fontSize);
    
    //move to new letter staring poistion and face north
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawHBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw left of H
    t.forward(100 * fontSize);
    
    //draw middle
    t.backward(50 * fontSize);
    t.turnRight();
    t.forward(60 * fontSize);
    
    //draw right side
    t.turnLeft();
    t.forward(50 * fontSize);
    t.backward(100 * fontSize);
    
    //move to new letter staring poistion and face north
    t.turnRight();
    t.penUp();
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawIBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
  
    //draw bottom of I and return to the bottom middle
    t.turnRight();
    t.forward(50 * fontSize);
    t.backward(25 * fontSize);
    
    //draw middle
    t.turnLeft();
    t.forward(100 * fontSize);
    
    //draw top
    t.turnLeft();
    t.forward(25 * fontSize);
    t.backward(50 * fontSize);
    
    //return to bottom right
    t.forward(25 * fontSize);
    t.turnLeft();
    t.forward(100 * fontSize);
    t.turnLeft();
    t.forward(25 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawJBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
  
    //go to middle starting point
    t.turnRight();
    t.forward(40 * fontSize);
    t.turnLeft();
    t.forward(20 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw middle
    t.forward(75 * fontSize);
    
    //draw top
    t.turnLeft();
    t.forward(40 * fontSize);
    t.backward(80 * fontSize);
    
    //return to bottom middle
    t.forward(40 * fontSize);
    t.turnLeft();
    t.forward(75 * fontSize);
    
    //draw curve
    int length = (8 * fontSize);
    int angle = 19;
    for(int loop = 1; loop < 9; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(180);
    t.forward(19 * fontSize);
    t.turnLeft();
    t.forward(90 * fontSize);
    t.turnLeft();
  }
  
  public static void drawKBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of K
    t.forward(100 * fontSize);
    
    //return to the middle
    t.backward(50 * fontSize);
    
    //draw upper slant
    t.turn(30);
    t.forward(58 * fontSize);
    
    //return to middle;
    t.backward(58 * fontSize);
    
    //draw lower slant
    t.turn(120);
    t.forward(58 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawLBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of L
    t.forward(100 * fontSize);
    
    //return to the bottom
    t.turn(180);
    t.forward(100 * fontSize);
    
    //draw bottom of L
    t.turnLeft();
    t.forward(70 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawMBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color and width
    t.setPenColor(c);
    t.penDown();
    
    //start first line
    t.forward(100 * fontSize);
    
    //turn and start 2nd line
    t.turn(160);
    t.forward(90 * fontSize);
    
    //turn and start 3rd line
    t.turn(-140);
    t.forward(90 * fontSize);
    
    //turn and draw final line
    t.turn(160);
    t.forward(100 * fontSize);
  
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
    }
  
  public static void drawNBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw first line
    t.forward(100 * fontSize);
    
    //draw second line
    t.turn(150);
    t.forward(115 * fontSize);
    
    //draw last line;
    t.turn(-150);
    t.forward(100 * fontSize);
    
    //return to bottom right of the letter
    t.turn(180);
    t.forward(100 * fontSize);
    
    ////move to new letter staring poistion and face north
    t.penUp();
    t.turnLeft();
    t.forward(10 * fontSize);
    t.turnLeft();
    
  }
  
  
  
  public static void drawOBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //move to bottom middle of O
    t.turnRight();
    t.forward(20 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //begin drawing bottom left of O
    int angle = (30);
    int length = (16 * fontSize);
    t.setHeading(-90);
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //draw left of O
    t.setHeading(0);
    t.forward(40 * fontSize);
    
    //draw top of O
    for(int loop = 1; loop < 7; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //draw right of O
    t.setHeading(180);
    t.forward(40 * fontSize);
    
    //draw bottom right of O
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(48 * fontSize);
    t.turnLeft();
  
  }
  
  public static void drawPBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw back of P
    t.forward(100 * fontSize);
    
    //draw curve
    t.turn(90);
    int length = (10 * fontSize);
    int angle = 5;
    for(int loop = 1; loop < 5; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    int angle2 = 20;
    for(int loop = 1; loop < 8; loop = (loop + 1)) {
      t.turn(angle2);
      t.forward(length);
    }
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    //move to new letter staring poistion and face north
    t.penUp();
    t.backward(2 * fontSize);
    t.setHeading(180);
    t.forward(42);
    t.setHeading(90);
    t.forward(60 * fontSize);
    t.turnLeft();
  }
  
  public static void drawQBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //move to bottom middle of Q
    t.turnRight();
    t.forward(20 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //begin drawing bottom left
    int angle = (30);
    int length = (16 * fontSize);
    t.setHeading(-90);
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //draw left
    t.setHeading(0);
    t.forward(40 * fontSize);
    
    //draw top
    for(int loop = 1; loop < 7; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //draw right
    t.setHeading(180);
    t.forward(40 * fontSize);
    
    //draw bottom right
    for(int loop = 1; loop < 4; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    
    //draw slash
    t.penUp();
    t.setHeading(90);
    t.forward(38 * fontSize);
    t.setHeading(-60);
    t.penDown();
    t.forward(30 * fontSize);
    
    //move to new letter staring poistion and face north
    t.backward(30 * fontSize);
    t.penUp();
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  
  public static void drawRBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //Draw back of R
    t.forward(80 * fontSize);
    
    //set angle and length
    int angle = 40;
    int length = 20 * fontSize;
    
    //make bump
    for(int loop = 1; loop < 7; loop = (loop + 1)) {
    t.turn(angle);
    t.forward(length);
    }
    t.turn(angle);
    t.setHeading(-90);
    t.forward(30 * fontSize);
    
    //make last line
    int length2 = 30 * fontSize;
    int angle2 = 30;
    t.setHeading(90);
    t.turn(angle2);
    t.forward(length2);
    t.turn(angle2);
    t.forward(length2);
    t.turn(angle2);
    t.forward(5 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(20 * fontSize);
    t.turnLeft();
  }
  
  public static void drawSBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top-ish right of S area
    t.forward(80 * fontSize);
    t.turn(90);
    t.forward(40 * fontSize);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw top
    int length = (6 * fontSize);
    int angle = -15;
    t.setHeading(-30);
    for(int loop = 1; loop < 11; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw middle
    for(int loop2 = 1; loop2 < 6; loop2 = (loop2 + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    t.setHeading(90);
    int angle2 = 15;
    for(int loop = 1; loop < 17; loop = (loop + 1)) {
      t.turn(angle2);
      t.forward(length);
    }
    
    //return to bottom of letter area
    t.penUp();
    t.setHeading(180);
    t.forward(15 * fontSize);
    
    //move to new letter staring poistion and face north
    t.setHeading(90);
    t.forward(60 * fontSize);
    t.turnLeft();
  }
  
  public static void drawTBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to bottom middle
    t.turnRight();
    t.forward(30);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw middle
    t.turnLeft();
    t.forward(100 * fontSize);
    
    //draw top
    t.turnLeft();
    t.forward(30 * fontSize);
    t.backward(60 * fontSize);
    
    //return to bottom
    t.forward(30 * fontSize);
    t.turnLeft();
    t.forward(100 * fontSize);
    t.turnLeft();
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.forward(40 * fontSize);
    t.turnLeft();
  }
  
  public static void drawUBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top left of U area
    t.forward(100 * fontSize);
    t.turn(180);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw left part
    t.forward(70 * fontSize);
    
    //draw the bottom
    int length = (10 * fontSize);
    int angle = -15;
    for(int loop = 1; loop < 12; loop = (loop + 1)) {
      t.turn(angle);
      t.forward(length);
    }
    
    //draw right part
    t.setHeading(0);
    t.forward(70 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.backward(100 * fontSize);
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawVBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top left of V area
    t.forward(100 * fontSize);
    t.turn(160);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw left half
    t.forward(107 * fontSize);
    
    //turn and draw right half
    t.turn(-140);
    t.forward(107 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(180);
    t.forward(100 * fontSize);
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  public static void drawXBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw increasing slant
    t.turn(40);
    t.forward(100 * fontSize);
    
    //go to top of next line and prepare to draw
    t.turn(-130);
    t.penUp();
    t.forward(65 * fontSize);
    t.penDown();
    
    //draw decreasing slant
    t.setHeading(140);
    t.forward(100 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
  
  
  public static void drawWBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color and width
    t.setPenColor(c);
    t.penDown();
    
    //start first line
    t.forward(100 * fontSize);
    
    //move back to start
    t.turn(180);
    t.forward(100 * fontSize);
    
    //turn and start 2nd line
    t.turn(-160);
    t.forward(90 * fontSize);
    
    //turn and start 3rd line
    t.turn(140);
    t.forward(90 * fontSize);
    
    //turn and draw final line
    t.turn(-160);
    t.forward(100 * fontSize);
      
    //return to bottom right of letter
    t.backward(100 * fontSize);
  
    //move to new letter staring poistion and face north
    t.penUp();
    t.turnRight();
    t.forward(10 * fontSize);
    t.turnLeft();
    }
  
  public static void drawYBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //go to top left of Y area
    t.forward(100 * fontSize);
    t.turn(140);
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw top left half
    t.forward(50 * fontSize);
    
    //turn and draw top right half
    t.turn(-100);
    t.forward(50 * fontSize);
    
    //return to middle and draw bottom line
    t.backward(50 * fontSize);
    t.setHeading(180);
    t.forward(63 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.setHeading(90);
    t.forward(50 * fontSize);
    t.turnLeft();
  }
  
  public static void drawZBoldSize(Turtle t, Color c, boolean bold, int fontSize) { 
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the letter is supposed to appear
    
    //if bold is true then make line width 4, else, line width 2
    if (bold == true)
    {
      t.setPenWidth(4);
    }
    else
    {
      t.setPenWidth(2);
    }
    
    //prepare pen by placing it down and setting color
    t.setPenColor(c);
    t.penDown();
    
    //draw middle slant
    t.turn(40);
    t.forward(100 * fontSize);
    
    //draw top
    t.setHeading(-90);
    t.forward(65 * fontSize);
    
    //go to bottom and draw bottom line
    t.turnLeft();
    t.penUp();
    t.forward(77 * fontSize);
    t.penDown();
    t.turnLeft();
    t.forward(65 * fontSize);
    
    //move to new letter staring poistion and face north
    t.penUp();
    t.forward(10 * fontSize);
    t.turnLeft();
  }
  
}