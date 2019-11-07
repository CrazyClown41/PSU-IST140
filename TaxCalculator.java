package taxcalculator;
import java.util.Scanner;
public class TaxCalculator {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your martial status?");
        String martialStatus = scan.next();
        
        System.out.println("What is your income?");
        int income = scan.nextInt();
        
        
        if (martialStatus.equals("single")){
            if (income <= 7999){
                System.out.println("10%");
            }
            else if ((income >= 8000) && (income <= 31999 )) {
                System.out.println("$800 + 15%");
            }
            else if (income >= 32000){
                System.out.println("$4,400 + 25%");
            }
        }
        if (martialStatus.equals("married")){
            if (income <= 15999){
                System.out.println("10%");
            }
            else if ((income >= 16000) && (income <= 63999 )) {
                System.out.println("$1600 + 15%");
            }
            else if (income >= 64000){
                System.out.println("$8,800 + 25%");
            }
        }
    }
}
