import java.util.Scanner;

public class NcR_NpR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int chk = n-r;
        double nPr = 1;
        double nCr = 1;
        int rFact = 1;
        int limit = n-chk;
        for(int count=0;count<limit;count++){
            nPr *= n;
            n--;
        }
        for(int i=r;i>1;i--){
            rFact *= i;
        }
        nCr = nPr/rFact;
        System.out.println("Value of nPr = "+nPr);
        System.out.println("Rfact "+rFact);
        System.out.println("Value of nCr = "+nCr);
    }
}
