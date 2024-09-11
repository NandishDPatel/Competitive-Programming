import java.util.Scanner;

public class Q1MaxMin3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = maxNum(a,b,c);
        int min = minNum(a,b,c);
        System.out.println("Max num is : "+max+" and Min num is : "+min);
    }
    static int maxNum(int x,int y,int z){
        if(x>y & x>z){
            return x;
        } else if(y>x & y>z){
            return y;
        } else{
            return z;
        }
    }
    static int minNum(int x,int y,int z){
        if(x<y & x<z){
            return x;
        } else if(y<x & y<z){
            return y;
        } else{
            return z;
        }
    }
}