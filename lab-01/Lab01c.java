/*
 * A simple program to calculate mathematic expression
 * @Esad Tök
 * @21.02.2019
 */
public class Lab01c {
  public static void main(String[] args) {
    
    double a,b,x; // Defining veriables.
    
    // Declearing veriables
    a = 2;
    b = 3.5;
    x = 4; // Our first "x" veriable.
     

    // calculator for first result
    System.out.println( "x: " + x );
    System.out.println("f(" + x + ") is " + x * Math.pow(1/a , 2) * Math.exp(-Math.pow((x-b) , 2)/2 * Math.pow(1/a , 2)));
   
    x = 4.5;  // Our second "x" veriable.
    

    // calculator for second result.
    System.out.println();
    System.out.println( "x: " + x );
    System.out.println("f(" + x + ") is " + x * Math.pow(1/a , 2) * Math.exp(-Math.pow((x-b) , 2)/2 * Math.pow(1/a , 2))); 
    
}
}