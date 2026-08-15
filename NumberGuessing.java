import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        //Generate a random number between 1 ansd 100
        int number = ra.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("========== Number Guessing Game ==========");
        System.out.println("Guess a number between 1 and 100: ");
        System.out.println("You have " + maxAttempts + " attempts.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number){
                System.out.println("Too High! Try again.");
            }     
           else if (guess < number) {
            System.out.println("Too Low! Try again.");
           }
           else {
            System.out.println("Congratulations!!! You guessed it!");
            //System.out.println("The number was: " + number);
            System.out.println("Number of attempts used: " + attempts);
           }
       }while (attempts < maxAttempts );

       if (guess != number) {
        System.out.println("Sorry! You've used all your attempts. The correct number was: " + number);
       }
    }
}