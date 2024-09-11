import java.util.Scanner;

public class DistanceBetTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1,y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2,y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        System.out.println("Distance is : "+distance);
    }
}
