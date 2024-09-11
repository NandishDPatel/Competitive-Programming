import java.util.Scanner;

public class Q3EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        checkAge(age);
    }

    static void checkAge(int age) {
        if(age>18){
            System.out.println("Eligible to Vote!!");
        } else{
            System.out.println("Not Eligible to Vote :(");
        }
    }
}
