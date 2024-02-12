import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/words-within-two-edits-of-dictionary/
public class wordsWithin2EditsOfDict {
    public static void main(String[] args) {
        String[] dictionary = {"wood","joke","moat"};
        String[] queries = {"word","note","ants","wood"};
        System.out.println(twoEditWords(queries,dictionary));

    }
    static List<String> twoEditWords(String[] queries, String[] dictionary) {
    List<String> ans = new ArrayList<>();
    int count;
        for (int i = 0; i < queries.length; i++) {
            char[] char1= queries[i].toCharArray();
            for (int j = 0; j < dictionary.length; j++) {
                count=0;
                char[] char2= dictionary[j].toCharArray();
                int k=0;
                while(k!=char1.length){
                    if (char1[k]!=char2[k]){
                        count++;
                    }
                    k++;
                }
                if (count<=2){
                    ans.add(queries[i]);
                    break;
                }
            }
        }
    return ans;
    }
}
