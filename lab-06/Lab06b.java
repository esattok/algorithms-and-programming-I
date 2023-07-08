/*
 * A simple program to prompt user to enter a string then print some information.
 * 
 * This program takes a string then find the number of substing "bc"s and print the string before "bc" and after "bc"
 * 
 * @Esad İsmail Tök
 * @04.04.2019
 */ 
import java.util.Scanner;
 
 public class Lab06b 
 {
   private static final String SUB_SEQUENCE = "bc";
   
   public static void main( String[] args )
  {
   Scanner scan = new Scanner(System.in);
   
   String userInput;
   int counter;
   int firstPart;
   
   System.out.print( "Enter the sequence : " );
   userInput = scan.next();
   firstPart = userInput.indexOf( SUB_SEQUENCE );
   counter = bcFinder(userInput); 
   if ( counter > 0 )
   {
    System.out.println( "The number of \"bc\" in the sequence : " + counter );
    System.out.println( "First part of string is " + userInput.substring( 0, firstPart ) );
    System.out.println( "Second part of string is "+ userInput.substring( firstPart + 2, userInput.length() ));
   }
   else
   {
    System.out.println( "The string doesn't contain any substring \"bc\"s!" );
   }
  }
  
 
  public static int bcFinder( String userInput )
  {
   int pst;
   int a;
   int counter = 0;
   
   for ( a = 0; a < userInput.length(); a++ )
   {
    pst = userInput.indexOf( SUB_SEQUENCE, a - 1 );
    if ( a == pst )
    {
     counter = (counter + 1);
    }
   }
   return counter;
  }
  
 }
