/**
 * @author Nicholas Borrelli 2023
 */

package recursivetriangle;
import java.util.Scanner;
public class RecursiveTriangle {
    /**
     * Asks user hows many rows the triangle will have
     * Calls printTriangle() and scans for the user's input
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter how many rows:");
        printTriangle(scan.nextInt());
        
        System.out.println("Enter what characters you want as triangle: ");
        String pattern = scan.nextLine();
    }
    /**
     * If the user inputs a number less than one it will be return with nothing
     * When it is more than one until sideLength is equal to sideLength it will print []
     * 
     * @param sideLength is the user's input to how many rows the triangle will be
     */
    public static void printTriangle(String pattern, int sideLength){
        if (sideLength < 1) return;
         
        for (int i = 0; i < sideLength; i++){  
            System.out.print(pattern);  
        }  
        System.out.println(); 
        printTriangle (sideLength - 1);

    }
}
