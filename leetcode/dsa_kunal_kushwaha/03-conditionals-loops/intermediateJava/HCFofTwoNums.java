import java.util.Scanner;

public class HCFofTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int smallest = n2;
        if(n1<n2){
            smallest = n1;
        }
        int ans = smallest;
        while(smallest>0){
            if(n1%smallest==0 & n2%smallest==0){
                ans = smallest;
                break;
            }
            smallest--;
        }
        System.out.println("HCF is : "+ans);

    }
}
