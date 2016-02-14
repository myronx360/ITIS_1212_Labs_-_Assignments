/* Lab 6, Part D */
/* Testing program for class methods */
/* by Celine Latulipe */

public class Lab6PartD {
  public static void main(String [] args) 
  {
    // create string variables to hold help info
    String s, g, s1, g1;
    
    // call class methods on class directly
    s = Turtle.helpSetters();
    g = Turtle.helpGetters();
    
    // print out each of the two individual help strings
    System.out.println(s);
    System.out.println(g);
    
    World w = new World();
    Turtle t = new Turtle(w);
     // call class methods on a Turtle object
    s1 = t.helpSetters();
    g1 = t.helpGetters();
    
    // print out each of the two individual help strings
    System.out.println(s1);
    System.out.println(g1);
    
    // check to make sure both ways of calling helpSetters returned the string
    if (s1.equals(s)) { // string comparison returns true if two strings are the same
      System.out.println("helpSetters method is static and can be called on Turtle objects and Turtle class!");
    } else {
      System.out.println("Uh-oh, something is wrong with the helpSetters!");
    } 
    
    // check to make sure both ways of calling helpGetters returned the string
    if (g1.equals(g)) { // string comparison returns true if two strings are the same
      System.out.println("helpGetters method is static and can be called on Turtle objects and Turtle class!");
    } else {
      System.out.println("Uh-oh, something is wrong with the helpGetters");
    }
  }
}