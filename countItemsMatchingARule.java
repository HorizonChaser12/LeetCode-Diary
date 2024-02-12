import java.util.*;
//https://leetcode.com/problems/count-items-matching-a-rule/
public class countItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items=new ArrayList<>();
        items.add(List.of(new String[]{"phone","blue","pixel"}));
        items.add(List.of(new String[]{"computer","silver","phone"}));
        items.add(List.of(new String[]{"phone","gold","iphone"}));
        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(items,ruleKey,ruleValue));

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=0;
        int count=0;
        int value=0;
        if(ruleKey.equals("color"))
            value = 1;
        if(ruleKey.equals("name"))
            value = 2;
            while(i!=items.size()){
                if (items.get(i).get(value).equals(ruleValue)){
                    count++;
                }
                i++;
            }
        return count;
    }
}
