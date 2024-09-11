import java.util.Scanner;

public class Q9Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
    static int factorial(int n){
        int ans = 1;
        while(n>1){
            ans *= n;
            n--;
        }
        return ans;
    }
}
