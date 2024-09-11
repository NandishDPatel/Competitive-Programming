import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diagonal1 and Diagonal2 : ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        double area = 0.5*d1*d2;
        System.out.println("Rhombus area is : "+area);
    }
}
