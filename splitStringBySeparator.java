import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/split-strings-by-separator/
public class splitStringBySeparator {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("$easy$");
        list1.add("$problem$");
        char char1='$';
        System.out.println(splitWordsBySeparator(list1,char1));
    }
    static List<String> splitWordsBySeparator(List<String> words, char separator) {
//        My code
//        List<String> ans=new ArrayList<>();
//        String s="";
//        for (int i = 0; i < words.size(); i++) {
//            s="";
//            for (int j = 0; j < words.get(i).length(); j++) {
//                char a=words.get(i).charAt(j);
//                if(a!=separator){
//                    s+=words.get(i).charAt(j);
//                }
//                else if(!s.isEmpty()) {
//                    ans.add(s);
//                    s="";
//                }
//                if(j== words.get(i).length()-1 && !s.isEmpty()){
//                    ans.add(s);
//                    s="";
//                }
//            }
//        }
//        return ans;

//      Better Code
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (c != separator) {
                    currentWord.append(c);
                } else if (currentWord.length() > 0) {
                    ans.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
            if (currentWord.length() > 0) {
                ans.add(currentWord.toString());
            }
        }
        return ans;
    }
}
