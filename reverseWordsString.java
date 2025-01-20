import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class reverseWordsString {
    public static void main(String[] args) {
        String input="a";
        System.out.println(reverseWords(input));
    }
    public static String reverseWords(String s) {
//        s=s.trim().replaceAll("\\s+"," ");
//        String[] str= s.split(" ");
//        int j=str.length-1;
//        String[] ans=new String[str.length];
//        for (int i = 0; i < str.length; i++) {
//            ans[i]=str[j];
//                j--;
//        }
//        return String.join(" ",ans);


//      Without using much of the advanced things like regex and stuff.
        List<String> list = new ArrayList<>();
        s=s.trim();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length();) {
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            int start =i;
            while(i<s.length() && s.charAt(i)!=' '){
                i++;
            }
            int end =i;
            list.add(s.substring(start,end));
        }
        for (int i = list.size()-1; i >= 0; i--) {
            ans.append(list.get(i));
            if(i>0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
