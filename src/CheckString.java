import com.sun.scenario.effect.impl.state.AccessHelper;

import java.io.IOException;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args){
        String ileName = "data.txt";

        try{
            checkWord(getWord());
        }
        catch(IOException e) {
        }
    }

    public static String getWord(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.nextLine();
        return word;
    }

    public static void checkWord(String word) throws IOException{
        if (Character.isLetter(word.charAt(0))) {
            System.out.println(word + " is a word.");
        } else {
            System.out.println(word + " is not a word.");
            throw new IOException();
        }
    }

    public static void writeFile(String fileName, String [] arrayToWrite){

    }

    public static void readFile(){















        
    }


}
