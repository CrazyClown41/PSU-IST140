/*
 *  Nicholas Borrelli 2023
 */

import java.util.Scanner;
public class PossibleSubstrings {
    public static void main (String[] args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a word: ");
       String word = scan.next();
  
       for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= (word.length() - i); j++) {
                System.out.println(word.substring(j, j + i));
            }
        }
        System.out.println(word);
    }
}
