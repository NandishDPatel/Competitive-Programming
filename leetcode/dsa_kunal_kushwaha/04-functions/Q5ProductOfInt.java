import java.util.Scanner;

public class Q5ProductOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        product(n1,n2);
    }
    static void product(int a,int b){
        System.out.println("Product is = "+(a*b));
    }
}
