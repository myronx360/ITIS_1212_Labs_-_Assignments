import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 * This is Myron Williams' Turtle.
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
    * draw on
    * @param x the starting x position
    * @param y the starting y position
    * @param picture the picture to draw on
    */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
    * display to draw it on
    * @param x the starting x position
    * @param y the starting y position
    * @param modelDisplayer the thing that displays the model
    */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
    * @param modelDisplay the thing that displays the model
    */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  
  public static void main(String[] args){
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    // Turtle t2 = new Turtle(earth);
    t1.setShellColor(Color.blue);
    t1.setPenColor(Color.black);
    //t1.forward();
    t1.drawDollarSign(Color.blue);
    //t2.drawMustache(300, 300, Color.green);
    
  }
  
  public void drawT() { 
    this.forward(100); 
    this.turnLeft(); 
    this.penUp(); 
    this.forward(40); 
    this.turn(180); 
    this.penDown(); 
    this.forward(80); 
    this.hide();
    
    
  }
  public void drawSquare(){
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
    this.turnRight();
    this.forward(30);
  }
  public void drawSquare2(){
    int width = 30;
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  public void drawSquare3 ()  {
    int index = 0;
    int width = 30;
    
    while (index <= 4) {
      this.turnRight();
      this.forward(width);
      index++;
    }
  }
  
  public void drawHexagon() {
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
  }
  
  public void drawSquare(int width)
  {
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
  }
  
  //define a method to draw a hexagon of vairable line lengths
  
  public void drawHexagonOfLength(int length){
    /*Make turtle draw a hexagon*/
    if (length <= 0){
      System.out.println("Error: length passed in is not a positive integer");
      return;
    }
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
  }
  
  /*define a method to draw a hexagon of vairable line lengths, pen widths,
   headings, and starting positions*/
  
  public void drawHexagonOfLengthPen(int length, int penWidth, int heading, int startXPos, int startYPos){
    /*Make turtle draw a hexagon*/
    setPenWidth(penWidth);
    setHeading(heading);
    penUp();
    moveTo(startXPos, startYPos);
    penDown();
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
    forward(length);
    turn(60);
  }
  
  
  /************************** START OF ASSIGNMENT 1 ***********************/
  
  public void drawW(Color c){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    /*Draws a W*/
    this.penDown();
    this.setPenColor(c);
    //Makes \
    this.setHeading(-20);
    this.forward(70);
    this.backward(70);
    //Makes middle /
    this.setHeading(20);
    this.forward(60);
    //Makes middle \
    this.setHeading(160);
    this.forward(60);
    //Makes /
    this.setHeading(20);
    this.forward(70);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(70);
    this.setHeading(90);
    this.forward(35);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of W method
  
  public void drawI(Color c){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    /*Draws a I*/
    this.penDown();
    this.setPenColor(c);
    //Makes lower -
    this.setHeading(90);
    this.forward(60);
    this.turn(180);
    this.forward(30);
    //Makes |
    this.turn(90);
    this.forward(65);
    //Makes upper -
    this.turn(-90);
    this.forward(30);
    this.turn(180);
    this.forward(60);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(180);
    this.forward(65);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
    
  }//End of I method
  
  public void drawL(Color c){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    /*Draws a L*/
    this.penDown();
    this.setPenColor(c);
    //Makes -
    this.setHeading(90);
    this.forward(45);
    this.backward(45);
    //Makes |
    this.setHeading(0);
    this.forward(65);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(65);
    this.setHeading(90);
    this.forward(45);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }////End of L method
  
  public void drawA(Color c){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    /*Draws a A*/
    this.penDown();
    this.setPenColor(c);
    //Makes /
    this.setHeading(20);
    this.forward(70);
    //Makes \
    this.setHeading(160);
    this.forward(70);
    this.backward(35);
    //Makes -
    this.setHeading(270);
    this.forward(22);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(90);
    this.forward(22);
    this.setHeading(135);
    this.forward(35);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of A method
  
  /************* Assignment 1 Part 2***************************/
  
  public void drawWBold(Color c, boolean bold){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a W*/
    this.penDown();
    this.setPenColor(c);
    //Makes \
    this.setHeading(-20);
    this.forward(70);
    this.backward(70);
    //Makes middle /
    this.setHeading(20);
    this.forward(60);
    //Makes middle \
    this.setHeading(160);
    this.forward(60);
    //Makes /
    this.setHeading(20);
    this.forward(70);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(70);
    this.setHeading(90);
    this.forward(35);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of W method
  
  public void drawIBold(Color c, boolean bold){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a I*/
    this.penDown();
    this.setPenColor(c);
    //Makes lower -
    this.setHeading(90);
    this.forward(60);
    this.turn(180);
    this.forward(30);
    //Makes |
    this.turn(90);
    this.forward(65);
    //Makes upper -
    this.turn(-90);
    this.forward(30);
    this.turn(180);
    this.forward(60);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(180);
    this.forward(65);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
    
  }//End of I method
  
  public void drawLBold(Color c, boolean bold){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a L*/
    this.penDown();
    this.setPenColor(c);
    //Makes -
    this.setHeading(90);
    this.forward(45);
    this.backward(45);
    //Makes |
    this.setHeading(0);
    this.forward(65);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(65);
    this.setHeading(90);
    this.forward(45);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }////End of L method
  
  public void drawABold(Color c, boolean bold){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a A*/
    this.penDown();
    this.setPenColor(c);
    //Makes /
    this.setHeading(20);
    this.forward(70);
    //Makes \
    this.setHeading(160);
    this.forward(70);
    this.backward(35);
    //Makes -
    this.setHeading(270);
    this.forward(22);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(90);
    this.forward(22);
    this.setHeading(135);
    this.forward(35);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of A method
  
  /************* Assignment 1 Part 3***************************/
  
  public void drawWBoldSize(Color c, boolean bold, int size){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a W*/
    this.penDown();
    this.setPenColor(c);
    //Makes \
    this.setHeading(-20);
    this.forward(70 * size);
    this.backward(70 * size);
    //Makes middle /
    this.setHeading(20);
    this.forward(60 * size);
    //Makes middle \
    this.setHeading(160);
    this.forward(60 * size);
    //Makes /
    this.setHeading(20);
    this.forward(70 * size);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(70 * size);
    this.setHeading(90);
    this.forward(35 * size);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of W method
  
  public void drawIBoldSize(Color c, boolean bold, int size){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a I*/
    this.penDown();
    this.setPenColor(c);
    //Makes lower -
    this.setHeading(90);
    this.forward(60 * size);
    this.turn(180);
    this.forward(30 * size);
    //Makes |
    this.turn(90);
    this.forward(65 * size);
    //Makes upper -
    this.turn(-90);
    this.forward(30 * size);
    this.turn(180);
    this.forward(60 * size);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(180);
    this.forward(65 * size);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
    
  }//End of I method
  
  public void drawLBoldSize(Color c, boolean bold, int size){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a L*/
    this.penDown();
    this.setPenColor(c);
    //Makes -
    this.setHeading(90);
    this.forward(45 * size);
    this.backward(45 * size);
    //Makes |
    this.setHeading(0);
    this.forward(65 * size);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.backward(65 * size);
    this.setHeading(90);
    this.forward(45 * size);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }////End of L method
  
  public void drawABoldSize(Color c, boolean bold, int size){
    // assumes we begin facing up (North) with penUp, 
    // and that we are at the bottom-left of where the 
    //letter is supposed to appear
    
    if (bold == true) {
      // put code here that should execute if bold is true (set line thickness to 4)
      this.setPenWidth(4);
    } else {
      // put code here that should execute if bold is false (set line thickness to 2)
      this.setPenWidth(2);
    }
    
    /*Draws a A*/
    this.penDown();
    this.setPenColor(c);
    //Makes /
    this.setHeading(20);
    this.forward(70 * size);
    //Makes \
    this.setHeading(160);
    this.forward(70 * size);
    this.backward(35 * size);
    //Makes -
    this.setHeading(270);
    this.forward(22 * size);
    this.penUp();
    
    //Moves to bottom right side of letter
    this.setHeading(90);
    this.forward(22 * size);
    this.setHeading(135);
    this.forward(35 * size);
    
    //Moves to next letter
    this.setHeading(90);
    this.forward(10);
    this.setHeading(0);
  }//End of A method
  
  /******************** Assignment 1 Part 4*************************/
  //Draws WILLA
  public void writeName(Color c, int startXPos, int startYPos) {
    this.penUp();
    this.moveTo(startXPos, startYPos);
    this.drawW(c);
    this.drawI(c);
    this.drawL(c);
    this.drawL(c);
    this.drawA(c);
    this.penUp();
  }
  
  //Draw a O
  public void drawO(Color c, int angle, int dist, int penWidth, int xPos, int yPos){
    int index = 0;
    this.setPenColor(c);
    this.setPenWidth(penWidth);
    this.moveTo(xPos, yPos);
    this.penDown();
    
    while (index < 10){
      this.turn(angle);
      this.forward(dist);
      index ++;
    }
    this.penUp();
    this.setHeading(0);
  }
  
  /*************************End of Assignment 1**********************/
  
  /*************************Start of Assignment 2**********************/
  
  public void drawBowtie(int xPos, int yPos, Color c){
    this.penUp();
    this.moveTo(xPos, yPos);
    this.setPenColor(c);
    this.setPenWidth(3);
    this.penDown();
    this.forward(60);//Start of bowtie
    this.setHeading(135);
    this.forward(85);
    this.setHeading(0);
    this.forward(60);
    this.setHeading(225);
    this.forward(85);
    this.backward(35);//Start of the square in the center of the bowtie
    this.setHeading(0);
    this.penUp();
    this.forward(11);
    this.penDown();
    int width = 10;//draws a square
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.turnRight();
    this.forward(width);
    this.penUp(); //Moves turtle to the bottom right of bowtie
    this.backward(35);
    this.setHeading(90);
    this.forward(35);
    this.setHeading(90);
  }
  
  public void drawMustache(int xPos, int yPos, Color c){
    this.penUp();
    this.moveTo(xPos, yPos);
    this.setPenColor(c);
    this.setPenWidth(10);
    this.penDown();
    this.setHeading(-75);
    int index = 0;
    int angle = 55;
    int dist = 30;
    while (index < 5){//A loop that draws  a mustache
      this.turn(angle);
      this.forward(dist);
      index ++;
    }
    
    this.penUp();
    this.setHeading(90);
  }
  
  /*************************End of Assignment 2**********************/  
  
  /*************************Start of Lab 6**********************/
  public int getDistance(){
    int x = this.getXPos();
    int y = this.getYPos();
    int distance = (int)Math.sqrt((x*x) + (y*y));
    return distance;
  }
  public boolean isTurtleClose(Turtle otherTurtle, int threshold){
    if (threshold < 0){
      System.out.println("Error: threshold is negative.");
    }
    int otherTurtleXPos = otherTurtle.getXPos();
    int otherTurtleYPos = otherTurtle.getYPos();
    int x = this.getXPos();
    int y = this.getYPos(); 
    //Gets distance between two turtles
    double distance = (int)Math.sqrt(((x - otherTurtleXPos)*(x - otherTurtleXPos)) + ((y-otherTurtleYPos)*(y-otherTurtleYPos)));
    if (distance <= threshold){
      return true;
    }else{
      return false;
    }
  }
  
  public static String helpGetters(){
    String s = new String ("Common getters: isPenDown(), getPenColor(), getXPos(), getYPos");
    return s;
  }
  
  public static String helpSetters(){
    String s = new String ("Common setters: setPenColor(Color C), penDown(), penUp(), setHeading(int direction)");
    return s;
  }
  /*************************End of Lab 6**********************/
  
  /**************** Start of Assignment 5 part 2 *************/
  // assumes we begin facing up (North) with penUp, 
  // and that we are at the bottom-left of where the 
  //symbol is supposed to appear
  public void drawHeart(Color c){
    setPenColor(c);
    setPenWidth(8);
    setHeading(-45);
    penDown();
    forward(55);
    
    int angle = (40);
    int length = (16);
    for(int loop = 1; loop < 6; loop++) {
      turn(angle);
      forward(length);
    }
    
    setHeading(angle);
    forward(length+2);
    for(int loop = 1; loop < 6; loop++) {
      turn(angle);
      forward(length);
    }
    
    forward(42);
    penUp();
    setHeading(0);
  }
  
  public void drawMusicNote(Color c){
    penDown();
    setPenColor(c);
    setHeading(0);
    // Draws note
     for(int loop = 1; loop < 15; loop++) {
      turn(-20);
      forward(2);
      setPenWidth(11);
    }
    //Draws |
     setHeading(0);
    int length = 45;
    setPenWidth(6);
    forward(length);
    //Draws -
    setHeading(90);
    setPenWidth(7);
    forward(length-6);
    // Draws |
    setHeading(180);
    setPenWidth(6);
    forward(length);
    //Draws note
    setHeading(-25);
    for(int loop = 1; loop < 15; loop++) {
      turn(-20);
      forward(2);
      setPenWidth(11);
    }
    
    penUp();
    setHeading(0);
    hide();
  }
  
  public void drawDollarSign(Color c){
    penUp();
    TurtleAlphabet.drawSBoldSize(this,c,true,1);
    penUp();
    setHeading(-90);
    forward(30);
    setHeading(0);
    // draws |
    penDown();
    forward(90);
    setHeading(-90);
    penUp();
    forward(15);
    //draws |
    penDown();
    setHeading(180);
    forward(90);
    
    penUp();
    setHeading(0);
  }
  
  public void drawXTTT(int width)
  {
    //Move turtle into position to draw X
    this.penUp();
    this.setHeading(0);
    this.forward(10);
    this.turnLeft();
    this.forward((int) (width * 0.06));
    
    this.setHeading(45);
    this.penDown();
    this.forward((int)(width * 0.1));
    this.forward((int)(width * 0.1));
    this.turn(180);
    this.forward((int)(width * 0.1));
    this.turnRight();
    this.forward((int)(width * 0.1));
    this.turn(180);
    this.forward((int)(width * 0.1));
    this.forward((int)(width * 0.1));
  }
  
  public void drawOctagonTTT(int width)
  {
    //Move turtle into position to draw octagon
    this.penUp();
    this.setHeading(0);
    this.forward(10);
    this.setHeading(360-90);
    this.forward((int)(width * 0.03));
    this.setHeading(360-45);
    this.penDown();
    
    for (int i = 0; i < 8; i++)
    {
      this.forward((int)(width * 0.07));
      this.turn(45);
    }
  } // this } is the end of class Turtle, put all new methods before this
}