import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{

  public static void main(String[] args) 
  {

    Random randgen = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int randomNumber = randgen.nextInt(250) + 1;
    System.out.println("Random number is " + randomNumber);
    System.out.println();
    
    int CountAttempts = 0;
    while(true) 
    {
      System.out.println("Enter your guess Between the numbers from : (1-250):");
      System.out.println();
      
      int playerGuess = scanner.nextInt();
      CountAttempts++;
      
      if (playerGuess == randomNumber)
      {
        System.out.println("Congratulations Your Guess is Correct !!");
        System.out.println("It took you " + CountAttempts + " tries to guess the Number!");
        
        break;
      }
      else if(randomNumber > playerGuess) 
      {
        System.out.println("Sorry! The number is Lower. Guess again.");
        System.out.println();
      }
      
      else if(randomNumber < playerGuess)
      {
        System.out.println("Sorry! The number is Higher. Guess again.");
        System.out.println();
      }
    }
    
   scanner.close();
    
  }
}

