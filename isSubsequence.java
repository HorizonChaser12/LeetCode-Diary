//https://leetcode.com/problems/is-subsequence/description/
public class isSubsequence {
    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";
        System.out.println(isSubsequences(s, t));
    }

    public static boolean isSubsequences(String s, String t) {
        int temp=0;
        if (temp==s.length()) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(temp)==t.charAt(i)){
                temp++;
            }
            if (temp == s.length()) {
                return true;
            }
        }
        return false;
    }
}
