//https://leetcode.com/problems/is-subsequence/description/
public class isSubsequence {
    public static void main(String[] args) {
        String s = "ab", t = "baab";
        System.out.println(isSubsequences(s, t));
    }

    public static boolean isSubsequences(String s, String t) {
//        int temp=0;
//        if (temp==s.length()) {
//            return true;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if(s.charAt(temp)==t.charAt(i)){
//                temp++;
//            }
//            if (temp == s.length()) {
//                return true;
//            }
//        }
//        return false;

        if(s.isEmpty()){
            return true;
        }
        int ans = 0;
        int lastIndex = -1;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(j > lastIndex && s.charAt(i) == t.charAt(j)){
                    ans++;
                    lastIndex = j;
                    break;
                }
            }
        }
        return ans == s.length();
    }
}
