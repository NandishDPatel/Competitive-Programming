import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println();
        if(num%2 == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}