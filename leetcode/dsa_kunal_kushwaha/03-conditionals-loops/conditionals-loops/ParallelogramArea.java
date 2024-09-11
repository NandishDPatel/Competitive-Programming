import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Height and Base : ");
        int h = sc.nextInt();
        int b = sc.nextInt();

        double area = h*b;
        System.out.println("Parallelogram area is : "+area);
    }
}
