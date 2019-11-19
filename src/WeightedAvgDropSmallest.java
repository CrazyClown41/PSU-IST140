import java.util.ArrayList;
import java.util.Scanner;
public class WeightedAvgDropSmallest {

    /**
     * Scans for the doubles from the user and stores them in an ArrayList
     * @return nums which is the ArrayList of numbers scanned by the user
     */
    public static ArrayList numbers() {
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5-10 numbers to be weighted averaged. Type Z to quit: ");
        while (scan.hasNextDouble()) {
            nums.add(scan.nextDouble());
        }
        return nums;
    }

    /**
     * Scans for how many grades to drop from the user
     * @return drop is an int which is scanned from the user on how many grades they want dropped
     */
    public static int drop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to drop: ");
        int drop = scan.nextInt();
        return drop;
    }

    /**
     * Scans for the weight of the grades from the user
     * @return weight of the grades which is scanned from the user
     */
    public static double weight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weight = scan.nextDouble();
        return weight;
    }

    /**
     * Removes the minimum value(s) from the ArrayList and calculates the average of the grades and then multiplies the average with the weight
     * @param nums which is the ArrayList of numbers scanned by the user
     * @param drop is an int which is scanned from the user on how many grades they want dropped
     * @param weight of the grades which is scanned from the user
     * @return average of the grades that does not include the dropped grades and is multiplied by the weight
     */
    public static double averageCalc(ArrayList<Double> nums, int drop, double weight) {
        double minVal = nums.get(0);
        for (int i = 0; i < drop; i++) {
            if (minVal >= nums.get(i)) {
                minVal = nums.get(i);
            }
            nums.remove(minVal);
        }

        double sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        double average = sum / nums.size();
        average *= weight;
        return average;
    }

    /**
     * Prints average
     * @param average of the grades that does not include the dropped grades and is multiplied by the weight
     */
    public static void printResults(double average){
        System.out.printf("The average is: %.2f", average);
    }

    /**
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ");
        printResults(averageCalc(numbers(), drop(), weight()));
    }
}
