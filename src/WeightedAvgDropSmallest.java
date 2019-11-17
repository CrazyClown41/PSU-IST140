import java.util.ArrayList;
import java.util.Scanner;
public class WeightedAvgDropSmallest {

    public static ArrayList numbers() {
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5-10 numbers to be weighted averaged. Type Z to quit: ");
        while (in.hasNextDouble()) {
            nums.add(in.nextDouble());
        }

        return nums;
    }

    public static int drop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to drop: ");
        int drop = in.nextInt();

        return drop;
    }

    public static double weight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        double weight = in.nextDouble();

        return weight;
    }

    public static double averager(ArrayList<Double> nums, int drop, double weight) {
        double average = 0;
        double min = nums.get(0);
        int counter = 0;
        while (counter <= drop) {
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < min) {
                    min = nums.get(i);

                }

            }

            counter++;
        }

        return average;
    }

    public static void main(String[] args) {
        ArrayList<Double> nums = numbers();
        int drop = drop();
        double weight = weight();
        averager(nums, drop, weight);
    }
}
