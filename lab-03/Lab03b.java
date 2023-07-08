/*
 * A simple program to determine the numbers are increasing, decreasing or neither.
 * 
 * This program prompts the user to enter three numbers and print “increasing” if they are in increasing order, 
 * “decreasing” if they are in decreasing order, and “neither” other​wise.
 * 
 * @Esad İsmail Tök
 * @01.03.2019
 */

import java.util.Scanner;
public class Lab03b
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "Enter three numbers: ");
   
    // Declaring veriables
    double number1;
    double number2;
    double number3;
    
    number1 = scan.nextDouble();
    number2 = scan.nextDouble();
    number3 = scan.nextDouble();
    // Using "and" satatement in condition to determine numbers are strictly increasing
    if (number1<number2 && number2<number3) {
      System.out.println( "increasing" );  
    }
   
    // Using "and" satatement in condition to determine numbers are strictly desreasing
    else if (number3<number2 && number2<number1) {
      System.out.println( "decreasing" );
    }
  
    // If numbers neither increasing nor decreasing program prints "neither"
    else {
      System.out.println( "neither" );
    }
    
      
  }
}