import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) 
        {
            int numberToGuess = random.nextInt(100) + 1; 
            int attempts = 5; 
            boolean guessedCorrectly = false;
            
            System.out.println("\nI have selected a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == numberToGuess)
                 {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    totalScore += attempts; 
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) 
                {
                    System.out.println("Too low! Try again.");
                } else 
                {
                    System.out.println("Too high! Try again.");
                }
                attempts--;
                if (attempts > 0) 
                {
                    System.out.println("You have " + attempts + " attempts left.");
                }
            }
                if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }
            System.out.println("Your current score: " + totalScore);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }
        System.out.println("\nGame Over! Your final score: " + totalScore);
        scanner.close();
    }
}
