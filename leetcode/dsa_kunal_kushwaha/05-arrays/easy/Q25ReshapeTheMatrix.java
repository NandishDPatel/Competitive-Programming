public class Q25ReshapeTheMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1,2},{3,4}};
        int row = mat.length;
        int col = mat[0].length;
        int r = 4, c = 1;
        int ans[][] = new int[r][c];
        if(r*c != row*col){
            System.out.println("Print Old Matrix");
        } else{
            int newR = 0;
            int newC = 0;
            for(int i=0;i< row;i++){
                for (int j=0;j<col;j++){
//                    System.out.println();
                    if(newC<c & newR<r){
                        ans[newR][newC] = mat[i][j];
                        System.out.println(newR+" - "+newC+" - "+ans[newR][newC]);
                        newC += 1;
                    } else if(newC>c & newR<r){
                        newC = 0;
                        ans[newR][newC] = mat[i][j];
                        System.out.println("here");
                        System.out.println(newR+" - "+newC+" - "+ans[newR][newC]);
                    }  else if(newC<c & newR>r){
                        newR += 1;
                        ans[newR][newC] = mat[i][j];
                        System.out.println("here");
                        System.out.println(newR+" - "+newC+" - "+ans[newR][newC]);
                        newC += 1;
                    }  else {
                        newC = 0;
                        newR += 1;
                        ans[newR][newC] = mat[i][j];
                        System.out.println("here");
                        System.out.println(newR+" - "+newC+" - "+ans[newR][newC]);
                        newC += 1;
                    }
                }
            }
            System.out.println("Printing the ans matrix");
            for (int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
