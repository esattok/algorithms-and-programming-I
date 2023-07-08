import java.util.Scanner;
public class Lab05b {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // variables
    double n;
    double a;
    double result;
    
    // propt user to enter a positive integer
    System.out.println( " Enter a positive integer: " );
    
    // initialization
    result = 0;
    
    // if input is not an integer print following statement
    if (!scan.hasNextInt() ){
      System.out.println( " The input n should be an integer. Exiting... ");
    }
    
    // if input is an integer do followings
    else {
      n = scan.nextInt();
      
      // if number is not positive or 0, promt user to enter a positive integer
      if  (n<=0) {
        System.out.println( "  The input n should be positive. Exiting... " );
      }
      
      // if number is positive, do following satatements
      else if (n>0) {
        
        // initialize "a" to 2 and add 1 until it become equal to input
        for (a = 2; a<=n; a++)
        {
          // update result and multiply with Math.pow function to adjust the sign
          result = result + ((a-1)/a)*Math.pow((-1),(a));
        }
        
        // print the result and add -1 
        System.out.println( -1 + result);
      }
      
    }
    
    
  }
}
