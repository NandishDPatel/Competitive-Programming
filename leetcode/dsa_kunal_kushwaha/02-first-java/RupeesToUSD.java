import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in INR : ");
        double inr = sc.nextDouble();

        double usd = inr/83.5;
        System.out.printf("Dollars : "+usd);
    }
}
