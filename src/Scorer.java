import java.util.Scanner;
public class Scorer {

    public static double[][] getNums() {
        Scanner scan = new Scanner(System.in);
        double[][] scores = new double[3][3];
        int i = 0;

        while (i < 3) {
            int j = 0;
            while (j < 3) {
                System.out.print("Enter a number: ");
                double value = scan.nextDouble();
                scores[i][j] = value;
                j++;
            }
            i++;
        }
        return scores;
    }


    public static double computeAvg(double[][] scores) {
        double value;
        double average = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                value = scores[i][j];
                average += value;
            }
        }
        return average;
    }


    public static void printResults(double average){
        System.out.printf("The average is: %.2f", (average / 3));
    }

    public static void main(String[] args){
        printResults(computeAvg(getNums()));
    }

}
