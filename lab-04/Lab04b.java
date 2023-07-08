/*
 * A simple program "guessing game".
 * 
 * This program generates a random integer between 1 and 100. User tries to find the number, or enter 0 to quit.
 * 
 * @Esad İsmail Tök
 * @13.03.2019
 */
import java.util.Scanner;
public class Lab04b 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    // variables
    int randomNumber;
    int count;
    int number;
    
    // prompt the user to enter an integer
    System.out.print( "Enter an integer between 1 and 100 (0 to quit): " );
    
    // initialize
    count =0;
    randomNumber = (int)(Math.random()*100); // the prgram generates a random integer between 1 and 100
    
    
    // if input is not an integer print following statement
    if (!scan.hasNextInt()) {      
      System.out.println( "Invalid input...Enter a number between 1 and 100 ( 0 to quit ):" );
    }
    
    // if input is an integer go following statements
    else  {
      number = scan.nextInt();
      
      // as soon as number is not equal to 0 and not equal to random number, check inside while statements
      while (number !=0 && number != randomNumber ) {
        
// while number is between 0 and 100, add 1 to count and go to if statements
        while ( number < 100 && 0 < number && number != randomNumber ) {
          count++;
          
          // if the inpus is within 20 and more than 10 of the random number, display following statement and promt user 
          // to enter an integer again
          if (number  <= randomNumber + 20  && number  > randomNumber + 10 || number  >= randomNumber - 20  && number  < randomNumber - 10 ) {
            
            System.out.println( "You are getting warmer." );
            System.out.print( "Enter a number between 1 and 100 (0 to quit): " );
            number = scan.nextInt();
          }
          
          // if the input is within 10 or less of the random number, display following statement and promt user to enter an integer again
          else if (number <= randomNumber + 10 && number > randomNumber || number >= randomNumber - 10 && number < randomNumber ) {
            
            System.out.println( "You are getting hot!" );
            System.out.print( "Enter a number between 1 and 100 (0 to quit): " );
            number = scan.nextInt();
          }
          
          // if the input is more than 20 away from the random number, display following statement and promt user to enter an integer again
          else if (number > randomNumber + 20 || number < randomNumber - 20 ) {
            
            System.out.println( "You are getting colder..." );
            System.out.print( "Enter a number between 1 and 100 (0 to quit): " );
            number = scan.nextInt();
          }   
          
        }
        
        // while the input is not between 0 and 100 prompt user to enter a correct number
        while ( number < 0 || number > 100 ) {
          System.out.print( "Invalid input...Enter a number between 1 and 100 ( 0 to quit ):" );
          number = scan.nextInt();
          
        }
        
      }
      // after loop is end if input = random number, print following statement
      if (number == randomNumber) {
        System.out.println( "Great! The number was " + randomNumber );
        // add 1 to count because after loop user enters one more input
        System.out.println( "You guessed it in " + (count + 1) + " tries !" ); 
      } 
      
      
      
      // if user enters 0 quit the game
      else {
        System.out.println( "Thanks for playing...");
      }
    }
    
    
  }
}
