import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String[] testData = {"Chair", "Table", "Pen"};

        try {
            checkWord(getWord());
            writeFile(fileName, testData);
            System.out.println(readFile(fileName));
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("This is not a word.");
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
            throw new IOException();
        }
    }

    public static void writeFile(String fileName, String [] arrayToWrite) throws FileNotFoundException {
        int length = arrayToWrite.length;
        PrintWriter out = new PrintWriter(fileName);
        try {
            for(int i = 0; i < length; i++){
                out.println(arrayToWrite[i]);
            }
        } finally {
            out.close();
        }
    }

    public static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        ArrayList<String> fileContents = new ArrayList<String>();
        try{
            File inFile = new File(fileName);
            Scanner scan = new Scanner(inFile);
            while (scan.hasNextLine())
                fileContents.add(scan.nextLine());

        } finally {
            return fileContents;
        }


    }

    }



