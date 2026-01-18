import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class firstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
  static int firstUniqChar(String s) {
//        if (s == null || s.isEmpty()) {
//            return -1;
//        }
//        int[] charCount = new int[26]; // Assuming only lowercase English letters
//
//        // Count the occurrences of each character
//        for (char c : s.toCharArray()) {
//            System.out.println(charCount[c - 'a']);
//            charCount[c - 'a']++;
//        }
//        // Find the index of the first unique character
//        for (int i = 0; i < s.length(); i++) {
//            if (charCount[s.charAt(i) - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1; // No unique character found

      HashSet<Character> set = new HashSet<>();
      for(int i = 0;i<s.length();i++){
          set.add(s.charAt(i));
      }
      int ans = 0;
      int[] freq = new int[26];
      for(int i = s.length()-1; i>=0;i--){
          freq[s.charAt(i) - 'a']++;
          if(freq[s.charAt(i) - 'a']==1){
              ans = i;
          }
      }
      System.out.println(Arrays.toString(freq));
      // for(int i = 0;i<s.length();i++){
      //     if(freq[s.charAt(i) - 'a']==1){
      //         return i;
      //     }
      // }
      return ans>1 ? -1 : ans;


    }
}
