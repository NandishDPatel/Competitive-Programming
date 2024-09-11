import java.util.Arrays;

public class Q8NumbersAreSmaller {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int ans [] = new int[nums.length];
        int count = 0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count += 1;
                }

            }
            ans[i] = count;
            count = 0;

        }
        System.out.println(Arrays.toString(ans));


    }
}
