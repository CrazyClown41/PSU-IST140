import java.io.FileNotFoundException;
import java.io.File;

public class PracticeFinal{

    public static generateSales(){
        int array [];
        for (int i = 0; i < 9; i++){
            int randInt = (int) (Math.random() * 100);
            intArray[i] = randInt;
        }
        System.out.println("The Random Integer Array is: " + intArray);
        return intArray;
    }

    public static writeFile(int [] intArray){
        int length = intArray.length;
        File fileName = "numbers.txt";
        PrintWriter out = new PrintWriter(fileName);
        try {
            for(int i = 0; i < length; i++){
                out.println(intArray[i]);
            }
        } catch (FileNotFoundException e){
                System.out.println("File not found.");
            }
         finally {
            out.close();
        }
        return fileName;
    }

    public static readNumbers(String fileName){
        ArrayList<String> fileContents = new ArrayList<String>();
        try{
            File inFile = new File(fileName);
            Scanner scan = new Scanner(inFile);
            while (scan.hasNextLine())
                fileContents.add(scan.nextLine());

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } finally {
            return fileContents;
        }

    }

    public static void main(String[]args){
        try{
            generatteSales();
        } 
    }

}