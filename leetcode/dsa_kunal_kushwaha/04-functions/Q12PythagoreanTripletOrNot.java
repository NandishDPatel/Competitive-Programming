import java.util.Scanner;

public class Q12PythagoreanTripletOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max,min,middle;
        if(a>b & a>c){
            max = a;
            if(b>c){
                middle = b;
                min = c;
            } else{
                min = b;
                middle = c;
            }
        } else if(b>a & b>c){
            max = b;
            if(a>c){
                middle = a;
                min = c;
            } else{
                middle = c;
                min = a;
            }
        } else{
            max = c;
            if(a>b){
                middle = a;
                min = b;
            } else{
                middle = b;
                min = a;
            }
        }
        ifPythagoreanTriple(max,middle,min);

    }
    static void ifPythagoreanTriple(int high,int mid,int low){
        if(Math.pow(high,2)==(Math.pow(mid,2)+Math.pow(low,2))){
            System.out.println("yes it is a triplet!!");
        } else{
            System.out.println("No it is not a triplet!!");
        }
    }
}
