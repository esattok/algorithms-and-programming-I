/*
 * A simple program to print information about the student.
 * 
 * This program prints information about student and his grades.
 * 
 * @Esad İsmail Tök
 * @26.02.2019
 */
import java.util.Scanner;
  public class Lab02b 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println( "Student information" );
    // User will write student information
    
    System.out.print( "Enter name: " );
    String name = scan.next();
    
    System.out.print( "Enter surname: " );
    String surname = scan.next();
    
    System.out.print( "Enter ID: " );
    int ID = scan.nextInt();
    
    System.out.println( "CS101 grades" );
    // User will write his/her CS101 grades
    
    System.out.print( "Enter the midterm 1 grade: " );
    int midterm1Grade_CS101 = scan.nextInt();
    
    System.out.print( "Enter the midterm2 grade: " );
    int midterm2Grade_CS101 = scan.nextInt();
    
    System.out.print( "Enter the final grade: " );
    int finalGrade_CS101 = scan.nextInt();
    
    System.out.println();  // Empty line between CS101 AND CS201 grades
    
    System.out.println( "CS201 grades" );
    // User will write his/her CS201 grades
    
    System.out.print( "Enter the midterm 1 grade: ");
    int midterm1Grade_CS201 = scan.nextInt();
    
    System.out.print( "Enter the midterm 2 grade: " );
    int midterm2Grade_CS201 = scan.nextInt();
    
    System.out.print( "Enter the final grade: " );
    int finalGrade_CS201 = scan.nextInt();
    
    String fName;
    String lName;
    
    // Adding quotation marks to start and end of user's full name
    fName = "\"Joe";   
    lName = "Doe\"";
    
    String fullName = fName + " " + lName;  // User's full name includes user's first name and last name
    System.out.println( "The student is " + fullName + ". His/her ID is 12345" );
    System.out.println( "Grades" );
    
    // Printing the summary of student's grades
    System.out.println( "|          |Mid1 |Mid2 |Final|" );
    System.out.println( "| CS101    |"+(double)midterm1Grade_CS101+" |"+(double)midterm2Grade_CS101+" |"+(double)finalGrade_CS101+" |" );
    System.out.println( "| CS201    |"+(double)midterm1Grade_CS201+" |"+(double)midterm2Grade_CS201+" |"+(double)finalGrade_CS201+" |" );
    
                       
    
    
  }
  }
    