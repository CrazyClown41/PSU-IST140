import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NumDescriptionWithExceptions {
    public static void main(String[] args){
        String fileName = "data.txt";
        printResults(fileName);
    }

    public static ArrayList<Double> readFile(String fileName){
        ArrayList<Double> fileContents = new ArrayList<Double>();
        try{
            File inFile = new File(fileName);
            Scanner scan = new Scanner(inFile);
            while (scan.hasNextLine())
                fileContents.add(scan.nextDouble());

        } finally {
            return fileContents;
        }
    }

    public static double findMean(ArrayList<Double> fileContents){
        int sum = 0;
        for (int i = 0; i< fileContents.size(); i++) {
            sum += fileContents.get(i);
        }

        double mean = sum / fileContents.size();

        return mean;
    }

    public static double findMedian(ArrayList<Double> fileContents){
        double temp = 0;
        if (fileContents.size() > 1)
        {
            for (int x = 0; x < fileContents.size(); x++)
            {
                for (int i = 0; i < fileContents.size() - x - 1; i++) {
                    if (fileContents.get(i).compareTo(fileContents.get(i+1)) > 0)
                    {
                        temp = fileContents.get(i);
                        fileContents.set(i,fileContents.get(i+1) );
                        fileContents.set(i+1, temp);
                    }
                }
            }
        }

        double middle;
        if (fileContents.size() % 2 == 1) {
            middle = (fileContents.get(fileContents.size() / 2) + fileContents.get(fileContents.size() / 2 - 1)) / 2;
        } else {
            middle = fileContents.get(fileContents.size() / 2);
        }
        return middle;
    }

    public static double findRange(ArrayList<Double> fileContents){
        if(fileContents.size() == 0 || fileContents.size() == 1){
            return fileContents.size();
        }

        double firstElement = fileContents.get(1);
        double max = firstElement;
        double min = firstElement;

        for(int i = 0; i < fileContents.size(); i++){
            double elementValue = fileContents.get(i);
            if(max < elementValue){
                max = elementValue;
            }
            if(elementValue < min){
                min = elementValue;
            }
        }
        return (max - min) + 1;
    }

    public static void printResults(String fileName){
        System.out.println("The numbers are: " + readFile(fileName));
        System.out.println("The mean is " + findMean(readFile(fileName)));
        System.out.println("The median is " + findMedian(readFile(fileName)));
        System.out.println("The range is " + findRange(readFile(fileName)));
    }

}
