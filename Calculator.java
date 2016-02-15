/**
 * Auto Generated Java Class.
 */
import javax.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;


//import java.io.*;
//import java.util.Scanner;
public class Calculator {
  
  public static void main(String[] args) { 
    double num1 = 0.0;
    double num2 = 0.0;
    double total = 0.0;
    String operator = new String("");
    
    // Creates a frame object
    JFrame frame = new JFrame("Test");
    frame.setVisible(true);
    frame.setSize(200, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Creates a label  and panel object
    JLabel label = new JLabel("Hello World");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);
    
    // Creates a button
    JButton button = new JButton("Button");
    panel.add(button);
    button.addActionListener(new Act());
    
    
    if (args.length > 0) {
      // Gets the first number 
      num1 = Double.parseDouble(args[0]);
      System.out.print(num1 + " ");
    } else {
      System.out.println("ERROR! You must pass in two numbers and an operator separated by a space!");
      System.out.println("Ex: 1 + 1");
      System.exit(0);
    }   
    
    
    if (args.length > 1) {
      // Gets the operator
      operator = args[1];      
      System.out.print(operator + " ");
    } else {
      System.out.println("ERROR! You must pass in a operator!");
      System.exit(0);
    }
    
    
    if (args.length > 2) {
      // Gets the second number
      num2 = Double.parseDouble(args[2]);
      System.out.print(num2+ " = ");
    } else {
      System.out.println("ERROR! You must pass in a second number!");
      System.exit(0);
    }
    
    
    if (operator.contentEquals("+")) {
      total = num1 + num2;
      System.out.println(" " + total);
    }else if(operator.contentEquals("-")){
      total = num1 - num2;
      System.out.println(" " + total);
    }else if(operator.contentEquals("/")){
      total = num1 / num2;
      System.out.println(" " + total);
    }else if(operator.contentEquals("*")){
      total = num1 * num2;
      System.out.println(" " + total);
    }else{
      // total = num1 * num2;
      //System.out.println(" " + total);
      System.out.println("\"" + operator + "\" is an Invalid Operater");
    }
  }
  
  /*public static double add(double num1, double num2) {
   total = num1 + num2;
   return total;
   }*/
  
  /* ADD YOUR CODE HERE */
  
}// End of Class
static class Act implements ActionListener {
  
  public void actionPerformed (ActionEvent e){
    JFrame frame2 = new JFrame("Clicked");
    frame2.setVisible(true);
    frame2.setSize(100, 100);
    JLabel label = new JLabel("cliked");
    JPanel panel = new JPanel();
    frame2.add(panel);
    panel.add(label); 
  }
}


