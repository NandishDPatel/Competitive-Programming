import java.util.Scanner;

public class Q2EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean ans = checkEven(num);
        if(ans){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    static boolean checkEven(int x){
        if(x%2==0){
            return true;
        } else{
            return false;
        }
    }
}
