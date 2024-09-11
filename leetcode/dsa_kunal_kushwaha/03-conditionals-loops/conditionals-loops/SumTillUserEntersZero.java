import java.util.Scanner;

public class SumTillUserEntersZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        } else{
            int sum = n;
            while(n!=0){
                System.out.print("Enter a number : ");
                n = sc.nextInt();

                sum += n;
            }
            System.out.println("Sum : "+sum);
        }
    }
}
