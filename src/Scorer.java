import java.util.Scanner;
public class Scorer {

    /**
     * Scans for the 9 ints for the array
     * @return scores which is a 2D Array (3x3)
     */
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

    /**
     * Prints the 2D Array and the average of each line
     * @param scores which is a 2D Array (3x3)
     * @return scores so computeAvg can call it in the main method
     */

    public static double[][] printResults(double[][] scores) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
        return scores;
    }

    /**
     * Calculates the average of each line and then prints the average
     * @param scores which is a 2D Array (3x3)
     */

    public static void computeAvg(double[][] scores){
        double[] average = new double[3];

        for(int i = 0; i < 3; i++){
            average[i] = (scores[i][0] + scores[i][1] + scores[i][2]) / 3;
            System.out.println("Average of Line " + (i + 1) + " is: " + average[i]);
        }
    }

    /**
     *
     * @param args command-line arguments
     */
    public static void main(String[] args){
        computeAvg(printResults(getNums()));
    }

}
