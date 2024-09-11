public class Q13FlippingAnImage {
    public static void main(String[] args) {
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int ans[][] = new int[image[0].length][image.length];

        for(int i=0;i< image.length;i++){
            for(int j=0;j<image[0].length;j++){
               if(image[i][j]==0){
                   ans[i][image[0].length-1-j] = 1;
               } else{
                   ans[i][image[0].length-1-j] = 0;
               }
            }
        }

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
