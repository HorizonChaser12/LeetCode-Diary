import java.util.Collections;
import java.util.HashSet;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class checkIfPanagram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangrams(sentence));
    }
    static boolean checkIfPangrams(String sentence) {
//      Easy code
//        HashSet<Character> set = new HashSet() ;
//        for(int i = 0 ; i < sentence.length() ; i++){
//            set.add(sentence.charAt(i)) ;
//        }
//        if(set.size()==26){
//            return true ;
//        }
//        return false ;

//        My complex code!
        int count=0;
        char[] alpha=new char[26];
        int j=0;
        for(char c='a';c<='z';c++){
            alpha[j]=c;
            j++;
        }
        char[] char1=sentence.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < char1.length; i++) {
            set.add(sentence.charAt(i));
        }
        for (int i = 0; i < set.size(); i++) {
            if (set.contains(alpha[i])){
                count++;
            }
        }
        return count == 26;
    }
}
