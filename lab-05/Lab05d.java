import java.util.Scanner;
public class Lab05d {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // variables
    String option1, option2, option3;
    String input1, input2, input3;
    String common;
    int a;
    double number;
    double b;
    double precision;
    double before;
    
    // initialization
    option1 = "Strings";
    option2 = "Math";
    option3 = "Exit";
    b = 1;
    
    // while the input is not option3 keep doing following statements
    do 
    {
      System.out.println( "**** Make your selection ****" );
      System.out.println( "Strings - Common characters" );
      System.out.println( "Math - 1/(1-x) calculation" );
      System.out.println( "Exit" );
      System.out.print( "Your selection: \t" );
      input1 = scan.next();
      
      // if user chose option 1 do following statements
      if (input1.equalsIgnoreCase(option1))
      {
        // initialize common as nothing an then add common letters to it
        common = " ";
        System.out.println( "** Finding Common Characters **" );
        // prompt user to enter strings
        System.out.print( "Enter a string: \t" );
        input2 = scan.next();
        System.out.print( "Enter another string: \t");
        input3 = scan.next();
        
        // "a" will increase until equals length of input2
        for (a=0; a<input2.length(); a++)
        {
          // generate a character then convert it to string
          char ch;
          ch = input2.charAt(a);
          String letter;
          letter = Character.toString(ch);
          
          // if input3 contains the character in input2 add this letter to "common"
          if (input3.contains(letter) && !common.contains(letter)) {
            
            common = common + " " + letter;
            
          }
        }
        System.out.println( "Common characters: " + common );
      }
      
      // if user choose option 2 do following statements
      else if (input1.equalsIgnoreCase(option2)) {
        
        System.out.println( "** 1/(1-x) Calculation **" );
        // prompt user to enter a number between -1 and 1
        System.out.println( "Enter an x: (-1,1): ");
        number = scan.nextDouble();
        // prompt user to enter a precision
        System.out.println( "Enter precision: ");
        precision = scan.nextDouble();
        System.out.println( "Current result is: " + b );
        
        do
        {
          before = b;
          b += number;
          number = number / 2;
          System.out.println( "Current result is: " + b );
        }
        while (b - before > precision);
        System.out.println( "Result is: " + b );
      }
      
      // if user do not enter a proper option and if the input is different from exit, print invalid selection 
      // and prompt user to enter a proper option
      else {
        if (!input1.equalsIgnoreCase(option3)) {
          System.out.println( "Invalid selection" );
        }
      }
    }
    // if the input is exit, quit the loop
    while (!input1.equalsIgnoreCase(option3));
    
    
    // if user choose option3 end the program
    if (input1.equalsIgnoreCase(option3)) {
      System.out.println( "Goodbye !" );
    }
  }
}




