import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){

    }
    //Get File
    public static File getFile(){
        File inputFile = new File("data.txt");
        return inputFile;
    }

    //Go through file and count the amount of letters in an array
    public static void letterCount(File inputFile){
        Scanner scan = null;
        try{
            scan = new Scanner (inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Invalid File.");
        }
        while(scan.hasNextLine()) {
            scan.nextLine();
        }

    }
    //Find the index of the largest value

    //Determine what letter is at that index

    //See if there are any other letters that are also that amount

    //print out results in a file

}
