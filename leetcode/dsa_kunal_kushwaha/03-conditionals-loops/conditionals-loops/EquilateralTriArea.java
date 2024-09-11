import java.util.Scanner;

public class EquilateralTriArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side length : ");
        int side = sc.nextInt();

        double area = (Math.sqrt(3)*side*side)/4;
        System.out.println("Equilateral Triangle area is : "+area);
    }
}
