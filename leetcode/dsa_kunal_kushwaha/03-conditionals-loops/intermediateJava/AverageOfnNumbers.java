import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total numbers: ");
        int n = sc.nextInt();
//        System.out.println();
        int x=1;
        double sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter a number : ");
            x = sc.nextInt();
            sum += x;
        }
        System.out.println("Average is : "+(double)(sum/n));
    }
}