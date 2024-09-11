public class Q15DiagonalSum {
    public static void main(String[] args) {
        int sum = 0;
//        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int matrixLen = mat.length;

        for(int i=0;i<matrixLen;i++){
            sum += mat[i][i];
            sum += mat[i][matrixLen-1-i];
        }
//        System.out.println(sum);
        if(matrixLen%2==0){
            System.out.println(sum);
        } else{
//            System.out.println(sum);
//            System.out.println(mat[(matrixLen+1)/2 - 1][(matrixLen+1)/2 - 1]);
            System.out.println(sum-mat[(matrixLen+1)/2 - 1][(matrixLen+1)/2 - 1]);
        }
    }
}
