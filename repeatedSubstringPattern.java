//https://leetcode.com/problems/repeated-substring-pattern/description/
public class repeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(repeatedSubstringPatterns(s));
    }
    static boolean repeatedSubstringPatterns(String s) {
//      Works in O(n^2) due to multiple comparison of all the substrings to get the actual result.
//      I didn't get the actual logic behind this and tend to learn it from the solution section but didn't see the code.
//      Use of string builder enhances the runtime due to its advanced methods and unnecessary time-consuming string concatenation.
        StringBuilder pattern = new StringBuilder();  // Using StringBuilder for efficiency
        StringBuilder compare;  // Another StringBuilder to build the comparison string
        for (int i = 0; i < s.length() - 1; i++) {
            pattern.append(s.charAt(i));
            // If s cannot be evenly divided by the length of the pattern, skip
            if (s.length() % pattern.length() != 0) {
                continue;
            }
            compare = new StringBuilder();
            // Build the repeated pattern string
            int repeatCount = s.length() / pattern.length();
            for (int j = 0; j < repeatCount; j++) {
                compare.append(pattern);
            }
            // Check if the constructed string matches the input
            if (compare.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
