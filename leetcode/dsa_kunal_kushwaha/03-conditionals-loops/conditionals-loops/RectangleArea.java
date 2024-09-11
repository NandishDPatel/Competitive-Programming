import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length and Breadth : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        double area = l*b;
        System.out.println("Rectangle area is : "+area);
    }
}
