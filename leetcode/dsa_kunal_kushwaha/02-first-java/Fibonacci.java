import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term till you want to print the fibonacci series : ");
        int n = sc.nextInt();
        int t0 = 0;
        int t1 = 1;
        int count = 1;
        System.out.print(t0+" ");
        System.out.print(t1+" ");
        while(count<n){
            int temp = t1;
            System.out.print(t1+" ");
            t0 = t1;
            t1 = t0+t1;

            count += 1;
        }
    }
}
