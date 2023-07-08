public class Lab05a {
  public static void main(String[] args) {
    
// variables
    int count;
    int avgCounter;
    double sum;
    double avg;
    double prob;
    int max;
    
    // initialization
    max = 0;
    sum = 0;
    count = 0;
    avgCounter = 0;
    
// constant
    final int totalNum = 1000;
    
    System.out.println( "Numbers with same middle digits: ");
    // propgram generates 1000 random number
    
    for (int a = 0; a<1000; a++)
    {
      // program generates random numbers with 4 digits
      int randomNum = (int)(Math.random()*9000)+1000;
      
      // convert random number to string to compare middle characters
      String number;
      number = Integer.toString(randomNum);
      
      // character variables
      char midNum1;
      char midNum2;
      
      // character initializations
      midNum1 = number.charAt(1);
      midNum2 = number.charAt(2);
      
      // program will compare middle numbers and if they are same, it will print them and count
      if (midNum1 == midNum2)
      {
        count++;
        System.out.println( randomNum );
      }
      
      // if the numbers are not same program will count the different ones and add sum the difference between middle numbers
      if (midNum1 != midNum2)
      {
        avgCounter++;
        sum = sum + Math.abs(midNum1-midNum2);
      }
      
      // update the max value
      if (midNum1 == midNum2 && randomNum>max )
      {
        max=randomNum;
      }
    }
    
    // compute average
    avg = sum / avgCounter;
    
    // compute the probability of generating number with same 2nd/3rd digit
    prob = totalNum / count;
    
    System.out.println( "The highest value with same 2nd/3rd digit: " + max );
    System.out.println( "Probability of generating number with same 2nd/3rd digit: " + prob );
    System.out.println( "The avarage difference between the 2nd and 3rd digit: " + avg );
  }
}

