class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int j = 0;
        if(n==1){
            ans[0] = 0;
            return ans;
        } else if (n%2 == 0) {
            int end = n/2;
            for(int i=1;i<=end;i++){
                ans[j] = i;
                ans[j+1] = -i;
                j += 2;
            }
            return ans;
        } else{
            int end = (n-1)/2;
            for(int i=1;i<=end;i++){
                ans[j] = i;
                ans[j+1] = -i;
                j += 2;
            }
            ans[n-1] = 0;
            return ans;
        }
    }
}