import java.util.Scanner;
public class ConeSurfaceArea {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        final double pi = 3.14;
        
        System.out.println("Enter height of cone:");
        int h = scan.nextInt();
        
        System.out.println("Enter radius of cone:");
        int r = scan.nextInt();
        
        double area = pi * r * (r + Math.sqrt(Math.pow(h,2) + Math.pow(r,2)));
        
        System.out.printf("%.2f", area);
    }
}
