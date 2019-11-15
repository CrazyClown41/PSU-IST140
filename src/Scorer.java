import java.util.Scanner;
public class Scorer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double [][] scores = new double[3][3];
        double value = 0;

        int i = 0;
        int j;

        while (i < 3) {
            j = 0;
            while (j < 3) {
                System.out.print("Enter a number: ");
                value = scan.nextDouble();
                scores[i][j] = value;
                j++;
            }
            i++;
        }

        for (i = 0; i < 3; i++) {
            int average = 0;
            for (j = 0; j < 3; j++) {
                value = scores[i][j];
                average += value;
            }
            System.out.println(average / 3);
        }
    }
}
