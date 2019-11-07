package guessrandom;
import java.util.Scanner;
public class GuessRandom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        final int MAX = 20;
        int randNum = (int) (Math.random() * 133); //comes up with at most 3 digit int
        randNum = randNum % (MAX + 1); //Make sure randNum is 0 to MAX
        //First Guess
        System.out.println("What is your first guess? ");
        int guess1 = scan.nextInt();
        
        if (guess1 == randNum){
            System.out.println("You guessed the right number! You Won!");
            return;
        }
        else if (guess1 < randNum){
            System.out.println("Your guess is too low!");
        }
        else if (guess1 > randNum){
            System.out.println("Your guess is too high!");
        }
        //Second Guess
        System.out.println("What is your second guess? ");
        int guess2 = scan.nextInt();
        
        if (guess2 == randNum){
            System.out.println("You guessed the right number! You Won!");
            return;
        }
        else if (guess2 < randNum){
            System.out.println("Your guess is too low!");
        }
        else if (guess2 > randNum){
            System.out.println("Your guess is too high!");
        }
        //Third Guess
        System.out.println("What is your third guess? ");
        int guess3 = scan.nextInt();
        
        if (guess3 == randNum){
            System.out.println("You guessed the right number! You Won!");
            return;
        }
        else if (guess3 < randNum){
            System.out.println("Your guess is too low!");
        }
        else if (guess3 > randNum){
            System.out.println("Your guess is too high!");
        }
        //Fourth Guess
        System.out.println("What is your fourth guess? ");
        int guess4 = scan.nextInt();
        
        if (guess4 == randNum){
            System.out.println("You guessed the right number! You Won!");
        }
        else if (guess4 != randNum){
            System.out.println("You guessed the wrong number. You lost.");            
        }   
    }
}
