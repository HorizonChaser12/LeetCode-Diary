//https://leetcode.com/problems/isomorphic-strings/description/

public class isomorphicStrings {
    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        char[] char1=s.toCharArray();
        char[] char2=t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (char1[i]<=char2[i]){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
