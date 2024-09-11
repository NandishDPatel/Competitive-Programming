import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height : ");
        int h = sc.nextInt();
        System.out.print("Base : ");
        int b = sc.nextInt();
        double area = (double)0.5*b*h;
        System.out.println("Area is : "+area);
    }
}
