//https://leetcode.com/problems/replace-words/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Has some issues and the use of trees is required otherwise the use of hashmap and trie structure.
public class replaceWords {
    public static void main(String[] args) {
        List<String> dictionary=new ArrayList<>();
        dictionary.add("catt");
        dictionary.add("cat");
        dictionary.add("rat");
        dictionary.add("bat");
        String sentence="aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWordss(dictionary,sentence));
    }
    static String replaceWordss(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        System.out.println(dictionary);
        String[] str=sentence.split(" ");
        int j;
        for(int i=0;i<str.length;i++){
            int count=0;
            int k=0;
            j=0;
            char[] char1= str[i].toCharArray();
            while(k<dictionary.size() && j< dictionary.get(k).length()){
                if(char1[j]==dictionary.get(k).charAt(j)){
                    count++;
                    j++;
                }
                else {
                    k++;
                }
                if (k<dictionary.size() && count==dictionary.get(k).length()){
                    str[i]=dictionary.get(k);
                }
            }
        }
        String ans=str[0];
        for (int i = 1; i < str.length; i++) {
            ans=ans+" "+str[i];
        }
        return ans;


//          A viable solution but the use of many inbuilt functions make it looks easy otherwise with the use of normal logic its hard.
//        Collections.sort(dictionary);
//        StringBuilder ans = new StringBuilder();
//        String[] words = sentence.split(" ");
//
//        for (String word : words) {
//            String root = findRoot(dictionary, word);
//            ans.append(root).append(" ");
//        }
//
//        return ans.toString().trim();
//    }
//
//    private String findRoot(List<String> dictionary, String word) {
//        for (String root : dictionary) {
//            if (word.startsWith(root)) {
//                return root;
//            }
//        }
//        return word;
    }
}
