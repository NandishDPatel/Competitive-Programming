import java.util.Arrays;

public class Q6KidsWIthGreatestNumberOfCandies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
        boolean ans[] = new boolean[candies.length];
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans[i] = true;
            } else{
                ans[i] = false;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
