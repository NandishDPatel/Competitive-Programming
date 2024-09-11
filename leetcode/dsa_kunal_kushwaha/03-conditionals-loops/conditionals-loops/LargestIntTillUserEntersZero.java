import java.util.Scanner;

public class LargestIntTillUserEntersZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        } else{
            int largest = n;
            while(n!=0){
                System.out.print("Enter a number : ");
                n = sc.nextInt();
                if(n>largest){
                    largest = n;
                }

            }
            System.out.println("Largest number is : "+largest);
        }
    }
}
