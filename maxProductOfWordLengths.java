//https://leetcode.com/problems/maximum-product-of-word-lengths/description/?envType=problem-list-v2&envId=string
public class maxProductOfWordLengths {
    public static void main(String[] args) {
        String[] words = {"eae","ea","aaf","bda","fcf","dc","ac","ce","cefde","dabae"};
        System.out.println(maxProduct(words));
    }
    static int maxProduct(String[] words) {
        int max  = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isDifferent(words[i], words[j])) {
                    max = Math.max(words[i].length() * words[j].length(),max);
                }
            }
        }
        return max;
    }
    static boolean isDifferent(String S1, String S2){
        int[] freq = new int[26];
        for (int i = 0; i < S1.length(); i++) {
            freq[S1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < S2.length(); i++) {
            if (freq[S2.charAt(i) - 'a'] > 0){
                return false;
            }
        }
        return true;
    }
}
