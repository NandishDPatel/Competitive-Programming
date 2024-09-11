import java.util.Arrays;

public class Q10_Build_ArrayFrompermutation {
    public static void main(String[] args) {
//        int arr[] = {0,2,1,5,3,4};
        int arr[] = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArr(arr)));
    }
    static int[] buildArr(int arr[]){
        int arr1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[arr[i]];
        }
        return arr1;
    }
}