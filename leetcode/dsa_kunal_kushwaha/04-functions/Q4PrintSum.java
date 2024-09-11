import java.util.Scanner;

public class Q4PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sum(n1,n2);
    }
    static void sum(int a,int b){
        System.out.println("Sum is = "+(a+b));
    }
}
