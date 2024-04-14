//https://leetcode.com/problems/isomorphic-strings/description/
//https://leetcode.com/problems/isomorphic-strings/solutions/4960160/beats-100-easiest-code-with-comments-explained-beginner-friendly/?envType=daily-question&envId=2024-04-02
import java.util.Arrays;

public class isomorphicStrings {
    public static void main(String[] args) {
        String s="bba";
        String t="aab";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] a = new int[100];
        int[] b = new int[100];
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0;i<s.length();i++){
//           here it checks whether a character has appeared from string s or t.And even do they appear they should be same otherwise they are not isomorphic.
//           From the example I got to know why he has written "i+1" rather than just incrementing it. It's because to mark the character in the array that it belongs to the position of the letter in the string.
            if(a[s.charAt(i)] != b[t.charAt(i)]){
                return false;
            }
            a[s.charAt(i)]=i+1;
            b[t.charAt(i)]=i+1;
            System.out.println("a =" + Arrays.toString(a));
            System.out.println("b =" + Arrays.toString(b));
        }
        return true;
    }
}
