import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("All the factors are : ");
//        System.out.print("1 "+num+" ");
        for(int i=1;i<=(num/2);i++){
            if(num%i == 0){
                if(num == i){
                    System.out.print(num+" ");
                } else{
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println(num);
    }
}
