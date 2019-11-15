/*
 *  Nicholas Borrelli 2023
 */

import java.util.Scanner;
public class PatternMaker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Number Rows:");
        int numRows = scan.nextInt();
        System.out.println("Enter Number Columns:");
        int numCols = scan.nextInt();
        
        System.out.println("Enter String 1:");
        String str1 = scan.next();
        System.out.println("Enter String 2:");
        String str2 = scan.next();
        System.out.println("Enter Divider String:");
        String divider = scan.next();

        for (int i = 0; i < numRows; i++) {
            System.out.println("");
            for (int j = 0; j < numCols; j++) {
                if (j != 0) { 
                    System.out.print(divider);
                 }   
                if (i % 2 == 0) {

                     if (j % 2 == 0) {
                        System.out.print(str1);
                    } else {
                         System.out.print(str2);
                    }
                } else if (j % 2 == 0) {
                     System.out.print(str2);
                } else {
                    System.out.print(str1);
            
            }
                    
        }
        System.out.println("");
    }
    }
}
