//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
public class numberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "aaacb";
        System.out.println(numberOfSubstrings(s));
    }
    static int numberOfSubstrings(String s) {
        int left = 0, right = 0, count = 0;
        int n = s.length();
        int[] freq = new int[3]; // Frequency array for 'a', 'b', and 'c'

        while (right < n) {
            char currentChar = s.charAt(right);
            freq[currentChar - 'a']++; // Increment the frequency of the current character
            // When the window contains all three characters, count valid substrings
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count += n - right; // All substrings ending at 'right' are valid
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--; // Decrement the frequency of the left character
                left++; // Move the left pointer to the right
            }
            right++; // Expand the window
        }
        return count;
    }
}
