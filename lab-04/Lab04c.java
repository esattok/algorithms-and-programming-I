

/*
 * A simple program to print important values of entered sequence of integers.
 *
 * This program takes a sequence of integers and display adjacent duplicates, maximum and minimum of the inputs,
 * sum and average of inputs, count of the inputs and the number of the even imputs.
 *
 * @Esad Ä°smail TÃ¶k
 * @13.03.2019
 */
import java.util.Scanner;
public class Lab04c
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );

        // variables
        int number;
        int sum;
        int count;
        int evenNumber;
        int max;
        int min;
        double avg;
        boolean isFirstTime;
        int previousInteger;

        // initials
        count = 0;
        sum = 0;
        evenNumber = 0;
        isFirstTime = true;
        previousInteger = Integer.MIN_VALUE;


        // prompt user to enter a sequence of integers
        System.out.print( "Enter a sequence of integers ( not-integer to process input )" );

        // initialize max as minimum integer and min as maximum integer
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        // if user does not enter an integer display following statement
        if ( !scan.hasNextInt()  ) {
            System.out.println( "No values entered." );
        }


        else if ( scan.hasNextInt()  ) {
            System.out.print("Duplicates : ");
            // as long as user enters an integer do following statements
            while ( scan.hasNextInt()  ) {

                // prompt user to enter an integer again
                number = scan.nextInt();
                // add 1 to count
                count++;
                // update sum
                sum = sum + number;

                // if the input is even number add 1 to even number count
                if ( number % 2 == 0 ) {
                    evenNumber++;
                }
                // if input is more than max ( it will be becouse max is minimum integer ), update max
                if ( number > max ) {
                    max = number;
                }
                // if input is less than min ( it will be becouse min is maximum integer ), update min
                if (number < min ) {
                    min = number;
                }

                // if input equals the previous number and the number is the first adjacent number, print that number
                if(previousInteger == number) {
                    if(isFirstTime == true) {
                        System.out.print(number + " ");
                        isFirstTime = false;
                    }
                }

                // if input doesn't equal to the previous number, update the previousInteger and set the isFirstTime = true
                else {
                    previousInteger = number;
                    
                    isFirstTime = true;
                }
                

            }
            // quit the loop and print following statements
            
            
            avg = (double)sum/count;

            System.out.println( "\n***************"  );
            System.out.println( "Max: " + max + " Min: " + min );
            System.out.println( "Sum: " + sum + " Average: " + avg );
            System.out.println( "Count: " + count + " Even count: " + evenNumber );
        }
        
    }
}



