import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
public class checkIfAStringIsAcronym {
    public static void main(String[] args) {
        String s = "abc";
        List<String> str= new ArrayList<>();
        str.add("alice");
        str.add("bob");
        str.add("charlie");
        System.out.println(isAcronym(str,s));
    }
    static boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        for(int i=0;i<words.size();i++){
            if(s.charAt(i)==words.get(i).charAt(0)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
