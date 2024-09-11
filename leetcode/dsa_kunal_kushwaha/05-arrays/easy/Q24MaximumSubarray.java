public class Q24MaximumSubarray {
    public static void main(String[] args) {
//        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {5,4,-1,7,8};
        int maxSum = nums[0];
        int checkSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i]+checkSum){
                checkSum = nums[i];
                if(maxSum<nums[i]){
                    maxSum = nums[i];
                }
            } else{
                checkSum += nums[i];
                if(maxSum<checkSum){
                    maxSum = checkSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
