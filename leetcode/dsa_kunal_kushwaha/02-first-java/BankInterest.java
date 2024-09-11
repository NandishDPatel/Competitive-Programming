import java.util.Scanner;

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal : ");
        double p = sc.nextDouble();
        System.out.print("Interest : ");
        double i = sc.nextDouble();
        System.out.print("Years : ");
        double t = sc.nextDouble();
        System.out.println("Maturity amount is "+(int)(p*t*i));
    }
}
