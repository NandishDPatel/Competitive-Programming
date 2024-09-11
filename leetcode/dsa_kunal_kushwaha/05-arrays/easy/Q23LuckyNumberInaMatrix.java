import java.util.ArrayList;
import java.util.List;

public class Q23LuckyNumberInaMatrix {
    public static void main(String[] args) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
        int max = 0;
        for(int i=0;i< matrix.length;i++){
            int min = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
            if(min>max){
                max = min;
            }
        }
        System.out.println(max);
        luckyNumbers.add(max);
    }
}
