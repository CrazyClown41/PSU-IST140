/*
 *  Nicholas Borrelli 2023
 */

import java.util.Scanner;
/**
 *
 * @author nicholasborrelli
 */
public class PasswordChecker {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your password: ");
        String inputPassword = scan.next();
        
        int passwordLength = inputPassword.length();
        if (passwordLength >= 4){
             
        }
        else 
            System.out.println("Password Invalid");
    }
    
}
