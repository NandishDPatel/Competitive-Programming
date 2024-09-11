import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        boolean isLeapYear = true;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeapYear = true;
                } else{
                    isLeapYear = false;
                }
            } else{
                isLeapYear = true;
            }
        } else{
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year !! ");
        }
    }
}
