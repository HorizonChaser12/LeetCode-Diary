import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
public class uncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "bannana";
        System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));
    }
    static String[] uncommonFromSentences(String s1, String s2) {
//      Fked it without using hashmap.
        List<String> list = new ArrayList<>();
        String[] s1words =  s1.split(" ");
        String[] s2words =  s2.split(" ");
        String[] total = new String[s1words.length+s2words.length];
        int i;
        for (i = 0; i < s1words.length; i++) {
            total[i]=s1words[i];
        }
        for (int j=0; j < s2words.length; j++) {
            total[i]=s2words[j];
            i++;
        }
        HashSet<String> set = new HashSet<>();
        for (int j = 0; j < total.length; j++) {
            if (!set.contains(total[j])){
                set.add(total[j]);
            }
            else{
                list.add(total[j]);
            }
        }
       List<String> list2 = new ArrayList<>();
        for (int j = 0; j < s1words.length; j++) {
            if (!list.contains(s1words[j])){
                list2.add(s1words[j]);
            }
        }
        for (int j = 0; j < s2words.length; j++) {
            if (!list.contains(s2words[j])){
                list2.add(s2words[j]);
            }
        }
        String[] ans = new String[list2.size()];
        for (int j = 0; j < ans.length; j++) {
            ans[j]=list2.get(j);
        }
        return ans;
    }
}
