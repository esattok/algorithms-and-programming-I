/*
 * A simple program to calculate basal metabolic rate calculator 
 * @Esad Tök
 * @21.02.2019
 */
public class Lab01b {
  public static void main(String[] args) {
    
    // Defining constants. Weight and height will not be changed but age will be changed.
    
    final int WEIGHT = 62;
    final int HEIGHT = 160;
    // Defining veriable age.
    
    int age; 
    double BMR;
    
    age = 25;
    BMR = 655 + (9.6 * WEIGHT) + (1.8 * HEIGHT) - (4.7 * age);     // The formula of BMR.
    System.out.println("weight(kg): " + WEIGHT);
    System.out.println( "height(cm): " + HEIGHT);
    System.out.println( "age(years): " + age);
    System.out.println();
    
    // BMR in age 25.
    System.out.println( "Based on a height of 160 and weight of 62 and age of 25, your BMR is " + BMR + " calories" );
    
    // Adding 1 to age. 
    age++;
    BMR = 655 + (9.6 * WEIGHT) + (1.8 * HEIGHT) - (4.7 * age); 
    
    
    // BMR in the age 26
    System.out.println( "Next year when you are " + age + " your bmr will be " + (double) Math.round(BMR) + " calories" );
    
    age = 25; // Redefined age as we start.
    age--; // Substracting 1 to our first age.
    
    BMR = 655 + (9.6 * WEIGHT) + (1.8 * HEIGHT) - (4.7 * age);
    
    //BMR in the age 24.
    System.out.println( "Last year when you were " + age + " your bmr was " + BMR + " calories" );
  }
  
}