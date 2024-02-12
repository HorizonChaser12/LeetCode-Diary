//https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/description/
public class whetherTwoStringsAreAlmostEqual {
    public static void main(String[] args) {
        String word1 = "abcdeef", word2 = "iiiiiii";
        System.out.println(checkAlmostEquivalent(word1,word2));
    }
    static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr= new int[26];
        for(int i=0;i<word1.length();i++){
            arr[word1.charAt(i)-'a']++;
            arr[word2.charAt(i)-'a']--;
        }
        for (int j : arr) {
            if (j > 3 || j<-3) {
                return false;
            }
        }
        return true;
    }
}
