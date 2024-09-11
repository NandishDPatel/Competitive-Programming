import java.util.Scanner;

public class Q7PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        checkPrime(num);
    }
    static void checkPrime(int a){
        if(a<=2){
            System.out.println("Not a Prime Number");
        } else{
            for(int i=2;i<Math.sqrt(a);i++){
                if(a%i==0){
                    System.out.println("Not a Prime Number !! ");
                    break;
                }

            }
            System.out.println("Prime Number");
        }
    }
}
