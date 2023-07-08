/*
 * A simple program that simulates a die rolling game.
 * 
 * This program takes the total money of user, prediction for die (odd or even) and amount of money user wants to bet
 * if prediction is correct user earns money otherwise loses money
 * 
 * @Esad İsmail Tök
 * @04.04.2019
 */ 
import java.util.Scanner;
public class Lab06c {
  
   public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     double die;
     double money;
     int prediction;
     double bet;
     die = rollDie();
     System.out.print( "Enter your total money: " );
     money = scan.nextInt();
     System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
     prediction = scan.nextInt();
//     if (prediction != 1 && prediction != 2) {
//         System.out.println("Incorrect prediction!");
//         System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
//     prediction = scan.nextInt();
//     }
//     System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
     while (money > 0 && prediction !=0) {
       System.out.print( "Enter the amount of money you want to bet: " );
       bet = scan.nextInt();
       if (prediction != 1 && prediction != 2) {
//         System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
         System.out.println("Incorrect prediction!");
         System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
     prediction = scan.nextInt();
//     System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
       }
       else {
       if (bet > money) {
         System.out.println( "Your money is not enough!" );
//         System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
   }
       else if (die%2 == prediction%2) {
         
           System.out.println( "The value of die is " + (int)die );
           System.out.println( "Your total money is " + increaseMoney(money, bet) );
           System.out.println( "**************************************" );
           money = increaseMoney(money, bet);
           die = (int)rollDie();
           System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
     prediction = scan.nextInt();
//     System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
       }
         else if (die%2 != prediction%2) {
           System.out.println( "The value of die is " + (int)die );
           System.out.println( "Your total money is " + decreaseMoney(money, bet) );
           System.out.println( "**************************************" );
           money = decreaseMoney(money, bet);
            die = (int)rollDie();
           System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
     prediction = scan.nextInt();
//     System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
         }
//          if (prediction != 1 && prediction != 2) {
//         System.out.println("Incorrect prediction!");
//         System.out.print( "Enter prediction (1 for ODD, 2 for EVEN): " );
//     prediction = scan.nextInt();
//     System.out.print( "Enter the amount of money you want to bet: " );
//       bet = scan.nextInt();
//       }
       }
     }
      
       
       
   }
     
   
   public static double rollDie() {
    int a;
     a = (int)(Math.random()*6 + 1);
     return a;
}
   public static double increaseMoney(double money, double bet) {
     
     money = money + (bet/2);
     return money;
}
   public static double decreaseMoney(double money, double bet) {
     
     money = money - (bet/4);
     return money;
   }
}
