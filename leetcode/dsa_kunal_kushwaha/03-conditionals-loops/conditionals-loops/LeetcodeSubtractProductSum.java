import java.util.Scanner;

public class LeetcodeSubtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        int sumDigit = 0;
        int productDigit = 1;
        while(num>0){
            int rem = num%10;
            sumDigit += rem;
            productDigit *= rem;
            num = num/10;
        }
        int ans = productDigit-sumDigit;
        System.out.println("Answer is : "+ans);
    }
}
