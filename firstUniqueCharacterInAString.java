//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class firstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
  static int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            System.out.println(charCount[c - 'a']);
            charCount[c - 'a']++;
        }
        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // No unique character found
    }
}
