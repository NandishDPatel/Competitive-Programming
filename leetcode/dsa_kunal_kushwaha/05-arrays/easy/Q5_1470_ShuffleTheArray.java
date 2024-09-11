import java.util.Arrays;

public class Q5ShuffleTheArray {
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7};
        int n = 3;
        int ans[] = new int[nums.length];
        int j = 0;
        for(int i=0;i<n;i++){
            ans[j] = nums[i];
            ans[j+1] = nums[(nums.length/2)+i];
            j = j+2;
//            ans[i+ nums.length] = nums[i+ nums.length];
        }
        System.out.println(Arrays.toString(ans));
    }
}
