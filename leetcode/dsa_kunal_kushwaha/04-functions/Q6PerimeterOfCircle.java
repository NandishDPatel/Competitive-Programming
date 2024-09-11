import java.util.Scanner;

public class Q6PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        perimeter(radius);
    }
    static void perimeter(int r){
        System.out.println("Perimeter is = "+(double)(2*3.14*r));
    }
}
