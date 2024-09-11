import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of units used : ");
        int unit = sc.nextInt();
        double bill = 0;
        if(unit<100){
            bill = unit*1.20;
        } else if(unit<300){
            bill = (100*1.2) + ((unit-100)*2) ;
        } else{
            bill = (100*1.2) + (200*2) + (unit-300)*3;
        }
        System.out.println("Amount to be paid for the bill is : "+bill);

    }
}
