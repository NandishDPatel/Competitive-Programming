package easy;

public class Q10CheckIfAPangram {
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence1));
        //        String sentence = "leetcode";
    }
    static boolean checkIfPangram(String sentence){
        int[] chars = new int[26];
        for(char ch:sentence.toCharArray()){
            int index = ((int)ch) - 97;
            chars[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if(chars[i]==0){
                return false;
            }
        }
        return true;
    }
}
