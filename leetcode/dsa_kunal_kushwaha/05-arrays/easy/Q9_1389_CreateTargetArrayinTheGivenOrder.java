import java.util.Arrays;

public class Q9CreateTargetArrayinTheGivenOrder {
    public static void main(String[] args) {
//        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        int chk[] = new int[26];
        System.out.println(sentence.length());
        if(sentence.length()<26){
            System.out.println("False");
        } else{
            for(int i=0;i<sentence.length();i++){
                int index = sentence.charAt(i) - 'a';
                chk[index] += 1;
            }
            boolean ans = true;
            for(int i=0;i<26;i++){
                if(chk[i]==0){
                    ans = false;
                    break;
                }
            }
            if(ans){
                System.out.println("True");
            } else{
                System.out.println("False");
            }

        }
    }
}


/*Bigger time complexity*/
//
//    int nums[] = {1,2,3,4,0};
//    int index[] = {0,1,2,3,0};
//    int ans[] = new int[nums.length];
//
//        for (int i=0;i< nums.length;i++){
//        ans[i] = -1;
//        }
//        System.out.println(Arrays.toString(ans));
//
//        for(int i=0;i< nums.length;i++){
//        if(ans[index[i]]==-1){
//        ans[i] = nums[i];
//        System.out.println("Here1 - "+Arrays.toString(ans));
//        } else{
//        System.out.println("index - i = "+index[i]);
//        int startPos = index[i];
//        int start = index[i];
//        while(ans[start]!=-1){
//        start ++;
//        }
//        for(int end=start;end!=startPos;end--){
//        int temp = ans[end];
//        ans[end] = ans[end-1];
//        ans[end-1] = temp;
//        }
//        ans[startPos] = nums[i];
//        System.out.println("Here2 - "+Arrays.toString(ans));
//        }
//        }
//        System.out.println(Arrays.toString(ans));