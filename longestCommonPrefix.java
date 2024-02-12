//https://leetcode.com/problems/longest-common-prefix/
import java.util.Arrays;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        String real =LongestCommonPrefix(str);
        System.out.println(real);
    }
    public static String LongestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
