import java.util.Scanner;
public class ChessLayout {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter position letter on chess board: ");
        String positionLetter = scan.next();
        
        System.out.println("Enter position number on chess board: ");
        int positionNumber = scan.nextInt();
        
        if ((positionLetter.equals("a") || (positionLetter.equals("c"))) || ((positionLetter.equals("e")) || (positionLetter.equals("g")))){
            if (positionNumber % 2 == 0)
                System.out.println("color is light");
            else
                System.out.println("color is dark");
        } else
            if (positionNumber % 2 == 0)
                System.out.println("color is dark");
            else
                System.out.println("color is light");
        
        
        
        
    }
}
