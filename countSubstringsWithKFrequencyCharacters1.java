//https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i/description/
public class countSubstringsWithKFrequencyCharacters1 {
    public static void main(String[] args) {
        String s = "abacb";
        int k = 2;
        System.out.println(numberOfSubstrings(s,k));
    }
    static int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int result = 0;
        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];
            for (int end = start; end < n; end++) {
                char currentChar = s.charAt(end);
                freq[currentChar - 'a']++;
                if (hasAtLeastK(freq, k)) {
                    result++;
                }
            }
        }
        return result;
    }

    private static boolean hasAtLeastK(int[] freq, int k) {
        for (int count : freq) {
            if (count >= k) {
                return true;
            }
        }
        return false;
    }
}
