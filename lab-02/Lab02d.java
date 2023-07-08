/*
 * A simple program to print number between 1,000 and 999,999 without a comma.
 * 
 * This program reads a number between 1,000 and 999,999 from the user. Then print the number without a comma.
 * 
 * @Esad İsmail Tök
 * @26.02.2019
 */
import java.util.Scanner;
public class Lab02d
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "Please enter an integer between 1,000 and 999,999," );
    System.out.print( "using a comma after the thousands: " );
    
    String number;
    number = scan.next();
    
    // Using substring method to print number without comma
      String result = number.substring(0,2) + number.substring(3,6);  
      
      System.out.println( result );
    
  }
}