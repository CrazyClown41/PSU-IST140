/**
 * @author Nicholas Borrelli 2023
 */

import java.util.Scanner;
import java.util.Random;
public class ECommerceApp {
    
    public static void bannerPrinter(){    
        System.out.println("****************************************");
        System.out.println("===== Welcome to My eCommerce App! =====");
        System.out.println("****************************************");
        System.out.println("");       
    }
    /**
     * Builds the product list for the later methods to call back to
     * 
     * @return productsCatalog containing the products stored in the store
     */
    public static String productBuilder(){
        String productsCatalog = "Desk, Table, Pen";
        return productsCatalog;
    }
    /**
     * Prompts the user for what they want for their order
     * Scans the String they input
     * Compares the two strings input and productCatalog
     * 
     * @param productsCatalog containing the products stored in the store
     * @return 
     */
    public static boolean getOrder(String productsCatalog){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your order?");
        String input = scan.nextLine();
        return productsCatalog.contains(input);
    }
    /**
     * @return random price
     */
    public static double getPrice(){
        Random rand = new Random();
        double price = rand.nextInt((100 - 1 + 1)) +1;
        return price;
    }
    /**
     * Declares double tax and computes a 10% tax using the double price
     * 
     * @param price random price
     * @return 10% tax of the random price 
     */
    public static double getTax(double price){
        double tax = (price * (10.0 / 100.0));
        return tax; 
    }
    /**
     * Adds price and tax to get the total price
     * 
     * @param price random price
     * @param tax 10% tax of the random price 
     * @return price + tax
     */
    public static double getTotal(double price, double tax){
        return price + tax; 
    }
    /**
     * Prints the total price using a printf method
     */
    public static void printTotal(){
        System.out.printf("Your sale total is $%.2f", getTotal(getPrice(), getTax(getPrice()))); 
    }
    /**
     * Prints the bannerPrinter() method to print the banner
     * Has an if statement to determine whether the getOrder() method is true and if it is it returns
     * the methods: getPrice(), getTax(), and printTotal()
     * If it is false it returns a string saying the product was no found
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args){
        bannerPrinter();
        
        if(getOrder(productBuilder()) == true){
            getPrice();
            getTax(getPrice());
            printTotal();
        }           
        else {
            System.out.println("The product was not found.");
        }
    }    
}
