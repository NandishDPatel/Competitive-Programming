import java.util.ArrayList;
import java.util.List;

public class Q11CountItemsMatchingARule {
    public static void main(String[] args) {

        String items[][] = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
        int index;
        if(ruleKey == "type"){
            index = 0;
        } else if (ruleKey=="color") {
            index = 1;
        } else{
            index = 2;
        }
        int count = 0;
        for(int i=0;i< items.length;i++){
                if(items[i][index] == ruleValue){
                    count += 1;
            };
        }
        System.out.println(count);

        List<List<String>> items1 = new ArrayList<>();
        System.out.println(items1.stream().count());
    }
}

/*
* class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if(ruleKey == "type"){
            index = 0;
        } else if (ruleKey=="color") {
            index = 1;
        } else{
            index = 2;
        }
        int count = 0;
        for(int i=0;i<items.stream().count();i++){
            if(items[i][index] == ruleValue){
                count += 1;
            }
        }
        return count;
    }
}
* */