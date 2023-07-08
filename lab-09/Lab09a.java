/** 
 * This program finds "n" amount of fibonacci number according to user's input
 * @Esad Ismail Tök
 * @09.05.2019
 */ 
import java.util.ArrayList; 
import java.util.Scanner; 
public class Lab09a{ 
  public static void main(String[] arg){ 
    Scanner input = new Scanner(System.in); 
    // prompt user to enter an integer
    System.out.print("Enter how many Fibonacci numbers will be generated : "); 
    // validate integer
    if(input.hasNextInt() == false){ 
      for(int i = 0;i < 50;i++){ 
        System.out.print("*"); 
      } 
      System.out.println(); 
      System.out.println("No number is generated!"); 
      for(int i = 0;i < 50;i++){ 
        System.out.print("*"); 
      } 
    }
    // if the input is less than one, do not generate number
    else{ 
      int n = input.nextInt(); 
      if(n < 1){ 
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        } 
        System.out.println();
        System.out.println("No number is generated!"); 
        for(int i = 0;i < 50;i++){ 
          System.out.print("*"); 
        } 
      }
      else{ 
        ArrayList<Integer> fiboList = new  ArrayList<Integer>(); 
        // if input is one do followings
        if(n == 1){ 
          fiboList.add(0); 
          for(int i = 0;i < 50;i++){ 
            System.out.print("*"); 
          } 
          System.out.println();
          System.out.println("Index : " + (n-1) + " Value : " + fiboList.get(0));
          for(int i = 0;i < 50;i++){ 
            System.out.print("*"); 
          } 
          System.out.println();
          System.out.println("Count of odd numbers in the list: " + 0); 
          System.out.println("Count of even numbers in the list: " +  1);
        }
        // first add two numbers to array then keep adding number which is the sum of previous two number
        
        else{ 
          fiboList.add(0); 
          fiboList.add(1); 
          for(int j = 1;j < n;j++){ 
            fiboList.add(fiboList.get(j - 1) + fiboList.get(j)); 
          } 
          for(int i = 0;i < 50;i++){ 
            System.out.print("*"); 
          } 
          System.out.println(); 
          // printing results
          for(int  i = 0;i < n;i++){ 
            System.out.println("Index : " + i + " Value : " + fiboList.get(i)); 
          } 
          for(int i = 0;i < 50;i++){ 
            System.out.print("*"); 
          } 
          System.out.println(); 
          // calculating the count of even and odd numbers
          int even = (int) Math.floor((n + 2) / 3); 
          System.out.println("Count of odd numbers in the list: " + (n - even)); 
          System.out.println("Count of even numbers in the list: " +  even); 
        } 
      } 
    }  
  } 
}