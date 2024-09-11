import java.util.Scanner;

public class LCMofTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int LCM = 1;
        if(n1<n2){
            LCM = n1;
        }

        while(true) {
            if( LCM % n1 == 0 && LCM % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, LCM);
                break;
            }
            ++LCM;
        }
        }
}
