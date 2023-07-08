import java.util.Scanner;
public class Lab05c {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // variables
    char ch;
    int h;
    double a;
    double b;
    double c;
    
    // prompt user to enter a character
    System.out.print( "Enter character to use: " );
    ch = scan.nextLine().charAt(0);
    
    // prompt user to enter an integer
    System.out.print( "Enter height of triangle: " );
    h = scan.nextInt();
    
    // initialize "a" as height and subtract 1 until 0 therefore loop will continue height times
    for (a = h; a > 0; a--) 
    {
      for (b = h; b > a; b--) 
      {
        // in every line add spaces at the beggining and at the end
        System.out.print(" ");
      }
      for (c = 0; c < (a * 2 - 1); c++) 
      {
        // in every line print character entered 2 times height minus 1
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}