/*
 * A simple program to calculate the largest power of 2 less than input.
 * 
 * This program takes an integer from the user and calculetes the largest power of 2 less than input.
 * 
 * @Esad İsmail Tök
 * @13.03.2019
 */
import java.util.Scanner;
public class Lab04a
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    // prompt the user to enter an integer n >= 2
    System.out.println( "Enter a positive integer n >= 2: " );
    
    // variables
    int count;
    int a;
    int number;
    
    // initialize
    count = 0;
    a = 1;
    
    // if the input is an integer, do following statements
    if (scan.hasNextInt()) {
      number = scan.nextInt();
      
      // if the input is >= 2, do following statements
      if ( number >= 2 ) {
        
        // while the condition is correct add 1 to count and update "a" to "a*2"
        while (number / 2 > a - 1) {
          a = a * 2;
          count++;
        }
        // inside if (number >= 2) condition if the input is equal to "a" after loop, update "a" to "a/2" and program
        // will print the previous power of two 
        if (number == a){
          a = a / 2;
          // print the following statement but do "count minus 1". Otherwise, it will print 1 more power of two  
          System.out.println( "The largest pover of 2 less then " + number + " is " + a + " (= 2 ^ " + (count - 1) + ")" );
        }
        
        // if the input is not equal to "a" after loop, print the following statement
        else {
          System.out.println( "The largest pover of 2 less then " + number + " is " + a + " (= 2 ^ " + (count) + ")" );
        }
      }
      
      // inside the integer contidion, if input is less than two print the following statement
      else if ( number < 2 ) {
        System.out.println( "The input n should be positive > " + number + ". Exiting..." );
      }
    }
    
    // if the input is not an integer print the following statement
    else {
      System.out.println( "The input n should be an integer. Exiting..." );
    }
    
  }
}
