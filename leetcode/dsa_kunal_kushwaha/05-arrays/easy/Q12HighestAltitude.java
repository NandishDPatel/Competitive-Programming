public class Q12HighestAltitude {
    public static void main(String[] args) {
//        int gain[] = {-5,1,5,0,-7};
        int gain[] = {-4,-3,-2,-1,4,3,2};
//        int ans[] = new int[gain.length];
//        ans[0] = 0;
        int sum = 0;
        int max = 0;

        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
