import java.util.Scanner;
public class MontyHall {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int numWinsCar = 0;
        int numWinsDonkey = 0;
        
        
        for (int i = 0; i < 1000; i++){
            int randInt = (int) (Math.random() * 233);
            int door = randInt % 3;
            
            if (door == 0){
                numWinsCar++;
            }
            if (door == 1){
                numWinsDonkey++;
            }
            if (door == 2){
                numWinsDonkey++;
            }
        }
        System.out.println("Out of 1000 Games You: ");
        System.out.println("---------------------- ");
        System.out.println("Won A Car " + numWinsCar + " times!") ;
        System.out.println("Won A Donkey " + numWinsDonkey + " times!");
    }
    
}
