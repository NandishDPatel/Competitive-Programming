import java.util.Scanner;

public class CalciMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double result = 0;

        System.out.print("Enter an operator :");
        char op = sc.next().trim().charAt(0);

        if(op == '+'){
            result = num1+num2;
        } else if(op == '-'){
            result = num1-num2;
        } else if(op == '*'){
            result = num1*num2;
        } else if(op == '/'){
            if(num2!=0) {
                result = (double)num1 / num2;
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
        System.out.println("Answer is : "+result);
    }
}
