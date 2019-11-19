import java.util.ArrayList;
import java.util.Scanner;
public class WeightedAvgDropSmallest {

    public static ArrayList numbers() {
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5-10 numbers to be weighted averaged. Type Z to quit: ");
        while (scan.hasNextDouble()) {
            nums.add(scan.nextDouble());
        }
        return nums;
    }

    public static int drop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to drop: ");
        int drop = scan.nextInt();
        return drop;
    }

    public static double weight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weight = scan.nextDouble();
        return weight;
    }

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

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.printf("The average is: %.2f", averageCalc(numbers(), drop(), weight()));
    }
}
