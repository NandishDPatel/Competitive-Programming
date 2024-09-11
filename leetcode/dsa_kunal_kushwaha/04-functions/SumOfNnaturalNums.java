import java.util.Scanner;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("N sum is : "+nSum(n));
    }
    static int nSum(int x){
        return (x*(x+1)/2);
    }
}
