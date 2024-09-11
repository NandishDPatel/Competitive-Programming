import java.util.Scanner;

public class PrimeNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        primeNums(n1,n2);
    }
    static void primeNums(int a,int b){
        int num = 0;
        int chk = 0;
        for(num=a;num<b;num++){
            boolean prime = true;
            if(num>2){
                for(chk=2;chk<=Math.sqrt(num);chk++){
                    if(num%chk==0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    System.out.print(num+" ");
                }
            }
        }
    }


}
