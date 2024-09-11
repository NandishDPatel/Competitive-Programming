import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        int l = str.length()-1;
        System.out.print("Reversed string is : ");
        for(int i=l;i>=0;i--){
            System.out.print(str.trim().charAt(i));
        }
    }
}
