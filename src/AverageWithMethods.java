/**
 * @author Nicholas Borrelli 2023
 */

import java.util.Scanner;

public class AverageWithMethods {
/** 
 * Prompts the user for the string of numbers
 * 
 * @return Returns that string of numbers 
 */
    public static String getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter up to ten numbers in one line: ");
        return scan.nextLine();
    }
/** 
 * Calculates the average of the numbers in the string
 * 
 * @parm str the string that is scanned from the user
 * @return Returns the total of the numbers in the string divided by how many numbers are in the string
 */
    public static double getAverage(String str) {
        double total = 0;
        int count = 0;
        Scanner scan = new Scanner(str);
        while (scan.hasNextDouble()){
            total += scan.nextDouble();
            count++;
        }
        return total / count;
    }
/** 
 * Prints the numbers 
 * 
 * @parm str the string that is scanned from the user
 *       result the int that is found in getAverage()
 */
    public static void printResults(String str, double result) {
        System.out.printf("The average of the numbers %s is %.2f.\n", str, result);
    }
/** 
 * Calls getUserInput() to equal to the string str 
 * Calls getAverage() to calculate the average of str
 * Calls printResults() to print results of str and average
 * 
 * @parm args command-line arguments 
 */    
    public static void main(String[] args) {
        String str = getUserInput();
        double average = getAverage(str);
        printResults(str, average);
    }
}