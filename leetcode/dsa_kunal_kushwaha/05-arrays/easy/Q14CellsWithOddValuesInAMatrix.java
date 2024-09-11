import java.util.Arrays;

public class Q14CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 48;
        int n = 37;
        int indices[][] = {{40,5}};
        int arr[][] = new int[m][n];
        for(int i=0;i< indices.length;i++){
            for(int j=0;j<n;j++){
                arr[indices[i][0]][j] += 1; //0
            }
            for(int k=0;k<m;k++){
                arr[k][indices[i][1]] += 1; //1
            }
        }
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2!=0){
                    ans+=1;
                }
            }

        }
        System.out.println(ans);
    }
}
