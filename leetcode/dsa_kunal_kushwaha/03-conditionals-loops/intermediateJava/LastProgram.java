import java.util.Scanner;

public class LastProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sumNeg = 0;
        int sumEven = 0;
        int sumOdd = 0;
       while(num!=0){

                if(num<0){
                    sumNeg += num;
                } else if(num%2==0){
                    sumEven += num;
                } else{
                    sumOdd += num;
                }
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            }

        System.out.println("Sum of Negative : "+sumNeg);
        System.out.println("Sum of Even Positive : "+sumEven);
        System.out.println("Sum of Odd Positive : "+sumOdd);
    }
}
