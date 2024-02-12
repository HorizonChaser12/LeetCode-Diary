//https://leetcode.com/problems/find-the-difference/description/
public class findTheDifference {
    public static void main(String[] args) {
        String s = "abcd",t = "abcde";
        System.out.println(findTheDifferences(s,t));
    }
    public static char findTheDifferences(String s, String t) {
        int length = t.length();
        char result = t.charAt(length - 1); // Last character of t

        for (int i = 0; i < length - 1; i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }

        return result;
    }
}
