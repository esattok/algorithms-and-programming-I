/*
 * A simple program to calculate the volume of a slice, based on the number of people.
 * 
 * This program takes radius and height of a cake and number of people then calculate the volume of a slice based on the number of people.
 * 
 * @Esad İsmail Tök
 * @04.04.2019
 */
import java.util.Scanner;
public class Lab06a {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   double radius;
    double height;
    int numPeople;
    System.out.print( "Enter radius of the cake: " );
    
    radius = scan.nextDouble();
    System.out.print( "Enter height of the cake: " );
    
    height = scan.nextDouble();
    
    System.out.print( "Enter number of people: " );
    
      numPeople = scan.nextInt();
    while (numPeople != 0) {
    
    
    System.out.println( "Number of people is " + numPeople + ". Volume of a slice is " + myMethod(radius, height, numPeople) );
    System.out.print( "Enter number of people: " );
    numPeople = scan.nextInt();
    }
    
    
  }
  public static double myMethod(double radius, double height, int numPeople ) {
  double volume;
  volume = ((Math.PI * Math.pow(radius,2) * height) / numPeople);
  return volume;
  }
}