import java.util.Scanner;
public class Receipt {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        
        // First Item
        System.out.println("What is the 1st item you purchased? ");
        String itemName1 = scan.next();
        System.out.println("What was the price of that item? ");
        double itemPrice1 = scan.nextDouble();
        
        //Second Item
        System.out.println("What is the 2nd item you purchased: ");
        String itemName2 = scan.next();
        System.out.println("What was the price of that item? ");
        double itemPrice2 = scan.nextDouble();
        
        //Receipt Format
        System.out.println("------------");
        System.out.println("Your Receipt");
        System.out.println("------------");
        System.out.printf("Item: %-10s", itemName1);
        System.out.printf("Price: %10.2f", itemPrice1);
        System.out.println();
        System.out.printf("Item: %-10s", itemName2);
        System.out.printf("Price: %10.2f", itemPrice2);
        System.out.println();
        double priceSubTotal = itemPrice1 + itemPrice2;
        
        
        double taxTotal = (priceSubTotal * 0.065);
 
        double priceTotal = priceSubTotal + taxTotal;
        
        System.out.println();
        System.out.printf("Tax: %28.2f", taxTotal);
        System.out.println();
        System.out.printf("Subtotal: %23.2f", priceSubTotal);
        System.out.println();
        System.out.printf("Total: %26.2f", priceTotal);
    }
}
