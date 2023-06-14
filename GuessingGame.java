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
    
    int score=0;
    
    
    
    while(true) 
    {
      System.out.println("Enter your guess Between the numbers from : (1-250):");
      System.out.println();
      
      int playerGuess = scanner.nextInt();
      CountAttempts++;
 
      
      if(CountAttempts>=1 && CountAttempts<=2)
      {
      	//System.out.println("----Congratulations you got 100 score----");
      	score+=100;
      }
      else if(CountAttempts<=8 && CountAttempts>=3)
      {
      	//System.out.println("----Congratulations you got 70 score----");
      	score+=70;
      }
      else if(CountAttempts<=25 && CountAttempts>=9)
      {
      	//System.out.println("----Congratulations you got 40 score----");
      	score+=40;
      }
     
      
      
      
      if (playerGuess == randomNumber)
      {
        System.out.println("Congratulations Your Guess is Correct !!");
        System.out.println();
        System.out.println("It took you " + CountAttempts + " tries to guess the Number!");
        System.out.println();
        System.out.println("Congratulations your score is : " + score);
        
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
    
    
  }
}

