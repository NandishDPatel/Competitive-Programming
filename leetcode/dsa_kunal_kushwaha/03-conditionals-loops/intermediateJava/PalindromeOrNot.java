import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.next();
        int l = str.length();
        boolean ans = true;
        for(int i=0;i<(l/2);i++){
            if(str.trim().charAt(i) != str.trim().charAt(l-1-i)){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palindrome");
        }
    }
}
