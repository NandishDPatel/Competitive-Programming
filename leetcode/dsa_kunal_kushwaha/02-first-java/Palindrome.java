import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        int len = str.length();
        boolean ans = true;
        for(int i=0;i<(int)(len/2);i++){
            if(str.trim().charAt(i) != str.trim().charAt(len-i-1)){
                ans = false;
//                break;
        }
        }
        if(ans){
            System.out.println("Palindrome String");
        } else{
            System.out.println("Not a Palindrome String :(");
        }
    }
}
