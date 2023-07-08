/*
 * The total amount of paint required to paint a triangular prism calculater.
 * 
 * This program calculates how many litters of paint are needed to paint a triangular prism.
 * 
 * @Esad İsmail Tök
 * @26.02.2019
 */
import java.util.Scanner;
public class Lab02c
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.print( "Enter triangle sides a, b, and c: " );
    
    // User will enter three different sides of triangle (all in centimeter)
    final int a, b, c;
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    
    System.out.print( "Enter triangle heigh h: " );
    final int heigh; 
      heigh = scan.nextInt();
    
    System.out.print( "Enter prism length l: " );
    final int length; 
      length = scan.nextInt();
      
    System.out.println( "We will paint a triangular prism" );
    // Converting the heigh, length and three different sides of triangular prism, from integer to double and printing.
    System.out.println( "The height of the triangle is " + (double)heigh );
    System.out.println( "The sides of the triangle are " + (double)a + ", " + (double)b + " and " +(double)c );
    System.out.println( "The length of the triangular prism is " + (double)length );
    // Declaring variable
    double area;
    area = (b*heigh) + (a+b+c)*length; // The formula of area
    
    System.out.println( "The area of the prism with respect to given parameters is " + (double)area );
    
    // Declaring variable paint amount which is needen for painting 1 centemetersquare of triangular prism
    double paintFor1cmSquare;
    paintFor1cmSquare = 0.01;
    
    System.out.println( "The required amount of color to paint one centimetersquare area is " + paintFor1cmSquare + " liters" );
    
    double totalPaint;
    totalPaint = (area*paintFor1cmSquare); // Calculating total paint to paint whole triangular prism
    
    System.out.println( "The total color amount required for painting is " + Math.round(totalPaint) + " liters" );
    
    
    
    
    
  }
}