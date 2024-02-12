import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
public class findResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        String[] words ={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));

    }
    static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length;i++) {
            char[] temp = words[i-1].toCharArray();
            char[] temp1 = words[i].toCharArray();
            Arrays.sort(temp);
            Arrays.sort(temp1);
            if (!Arrays.equals(temp,temp1)){
                list.add(words[i]);
            }
        }
        return list;
    }
}
