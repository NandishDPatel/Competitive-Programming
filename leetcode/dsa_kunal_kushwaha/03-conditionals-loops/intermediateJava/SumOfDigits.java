import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum is : "+sum);
    }
}
