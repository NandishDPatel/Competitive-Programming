import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        double area = 3.14*Math.pow(radius,2);
        System.out.println("Area is : "+area);
    }
}