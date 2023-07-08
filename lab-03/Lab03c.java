/*
 * A simple program to determine whether there are two pairs in input or not.
 * 
 * This program prompts the user to enter four integers. If the input consists of two matching pairs, it prints 
 * "Two pairs"and otherwise it prints "Not two pairs".
 * 
 * @Esad İsmail Tök
 * @01.03.2019
 */

import java.util.Scanner;
public class Lab03c
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "Enter four numbers: " );
    
    // Declaring veriables
    int number1;
    int number2;
    int number3;
    int number4;
    
    number1 = scan.nextInt();
    number2 = scan.nextInt();
    number3 = scan.nextInt();
    number4 = scan.nextInt();
    
    // Using 2 and statement in condition to make sure all numbers are same
    if ( number1 == number2 && number2 == number3 && number3 == number4 )
    {
      System.out.println( "Two pairs." );
    }
    
    // First probability to determine two pairs in the input
    else if ( number1 == number3 && number2 == number4 ) {
      System.out.println( "Two pairs." );
    }
    
    // Second probability to determine two pairs in the input
    else if ( number1 == number4 && number2 == number3 ) {
      System.out.println( "Two pairs." );
    }
    
    // Third probability to determine two pairs in the input
    else if ( number1 == number2 && number3 == number4 ) {
      System.out.println( "Two pairs." );
    }
    
    // If there is no "two pairs" in the income, program prints "Not two pairs."
    else {
      System.out.println( "Not two pairs." );
    }
    
  }
}