//https://leetcode.com/problems/word-pattern/
import java.util.Objects;
//use of hashmap is necessary here,without that its impossible to do this with less complexity!

public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPatterns(pattern,s));
    }
    public static boolean wordPatterns(String pattern, String s) {
        int count1=0;
        int count2=0;
        String[] str=s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = pattern.length()-1; j >= 0; j--) {
                if (pattern.charAt(i)==pattern.charAt(j)){
                    count1++;
                }
                else {
                    count1--;
                    break;
                }
                if (Objects.equals(str[i], str[j])){
                    count2++;
                }
            }

        }
        return count2 == count1;
    }
}
