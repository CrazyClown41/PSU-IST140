import java.util.Scanner;
public class TwistedPhoneNumber {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a 10 digit phone number: ");
        String phoneNumber = scan.next();
        
        // Reegular Phone Number
        System.out.print("This is the phone number you entered: ");
        System.out.println("(" + phoneNumber.substring(0,3) + ")" + "-" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10));
        
        // Twisted Phone Number
        System.out.print("This is the twisted phone number: ");
        String phoneNumberReverse = "(" + phoneNumber.substring(9) + phoneNumber.substring(phoneNumber.length()-2,9) + phoneNumber.substring(phoneNumber.length()-3,8) + ")" + "-" + phoneNumber.substring(phoneNumber.length()-4,7) + phoneNumber.substring(phoneNumber.length()-5,6) + phoneNumber.substring(phoneNumber.length()-6,5) + "-" + phoneNumber.substring(3,4) + phoneNumber.substring(2,3) + phoneNumber.substring(1,2) + phoneNumber.substring(0,1);       
        System.out.println(phoneNumberReverse);
    }
}
