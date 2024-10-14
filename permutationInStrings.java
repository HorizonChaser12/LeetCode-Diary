
//https://leetcode.com/problems/permutation-in-string/description/?envType=daily-question&envId=2024-10-05
public class permutationInStrings {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
    static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        // Count the frequency of characters in s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Count, s2Count)) return true;
            // Update the window
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the last window
        return matches(s1Count, s2Count);
    }

    static boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}
