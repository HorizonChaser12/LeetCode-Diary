//https://leetcode.com/problems/longest-palindrome/description/
public class longestPallindrome {
    public static void main(String[] args) {
       String s = "bb";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;
        int oddCount = -1;
        for (int v: count) {
            if (v % 2 != 0) oddCount++;
        }
        return (oddCount > 0) ? s.length() - oddCount: s.length();
    }
}
