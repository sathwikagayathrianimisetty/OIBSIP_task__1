import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int lowerBound=1;
        int upperBound=100;
        int maxAttempts=10;
        int rounds=3;
        int totalScore=0;
        System.out.println("WElcome to the Number Guessing Game");
        for(int round=1;round<=rounds;round++){
            int targetNumber=random.nextInt(upperBound-lowerBound+1)+lowerBound;
            int attempts=0;
            System.out.println("\nRound"+round+":Guess the number between "+lowerBound+" and "+upperBound);
            while(attempts<maxAttempts){
                System.out.println("Enter your guess:");
                int userGuess=sc.nextInt();
                attempts++;
                if(userGuess==targetNumber){
                    System.out.println("Congratulations!You guessed the correct number in "+attempts+"attempts");
                    int roundScore=maxAttempts-attempts+1;
                    totalScore+=roundScore;
                    break;
                
                }
                else if(userGuess<targetNumber){
                    System.out.println("Too low.Try again!");
                }
                else{
                    System.out.println("Too high.Try again!");
                }
            }
            if(attempts==maxAttempts){
                System.out.println("Sorry,you've reached the maximum attempts.The correct number was:"+targetNumber);
            }
        }
        System.out.println("\nGame Over!Your total score is:"+totalScore);
        sc.close();
    }
}
