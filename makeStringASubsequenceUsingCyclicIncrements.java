//https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/?envType=daily-question&envId=2024-12-04
public class makeStringASubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        String str1 = "om", str2 = "nm";
        System.out.println(canMakeSubsequence(str1,str2));
    }
    static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else if (str1.charAt(i) + 1 == str2.charAt(j)) {
                i++;
                j++;
            } else if (str1.charAt(i) == 'z' && str2.charAt(j) == 'a') {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == str1.length() && j != str2.length()) {
            return false;
        }
        return true;
    }
}
