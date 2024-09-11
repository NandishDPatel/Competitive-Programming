import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=x;i<=y;i++){
            int a = i%10;
            int b = (i/10)%10;
            int c = i/100;
            double result = Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            if(result == (double)i){
                System.out.println(i);
            }
        }
    }
}
/*
* armstrong number will be only possible between 100 and 999
* */