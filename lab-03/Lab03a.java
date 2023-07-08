/*
 * A simple program to calculate the result of the function.
 * 
 * This program takes a real number x and calculates the result of the function.
 * 
 * @Esad İsmail Tök
 * @01.03.2019
 */

import java.util.Scanner;
public class Lab03a
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "Enter a real value for x: " );
    
    double x;
    double result;
    x = scan.nextDouble();
    
    // Making a program which calculates following expression, if x > 10
    if ( x>10 ) {
      result = Math.sqrt(Math.pow(x,5)+1);
      System.out.print( "f(" + x + ") = " );
      System.out.printf( "%6.2f", result );
      System.out.println();
    }
    
    // making a program which calculates another expression, if x is between 0 and 10
    else if ( x>=0 ) {
      result = Math.exp(x) + 2;
      System.out.print( "f(" + x + ") = " );
      System.out.printf( "%4.2f", result );
      System.out.println();
    }
    
    // making a program which calculates last mathematical expression, if x < 0
    else {
      result = x/(x+10);
      System.out.print( "f(" + x + ") = " );
      System.out.printf( "%4.2f", result );
      System.out.println();
      
    }
  }
}

      
    