import java.lang.reflect.Array;
import java.util.Arrays;

public class Q26PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        for(int i= digits.length;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println("Print digits");
                break;
            }
            digits[i] = 0;
        }
        int ans[] = new int[digits.length+1];
        ans[0] = 1;
        System.out.println("Print the ans");
    }
}
