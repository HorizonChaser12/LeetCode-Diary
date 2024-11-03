//https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/description/
public class longestSubstringOfALlVowelsInOrder {
    public static void main(String[] args) {
        String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println(longestBeautifulSubstring(word));
    }
    static int longestBeautifulSubstring(String s) {
        int maxi = 0;
        int startIdx ;
        for(int i = 0 ; i < s.length() - 1 ; i++) {
            boolean aflg = false;
            boolean eflg = false;
            boolean iflg = false;
            boolean oflg = false;
            boolean uflg = false;
            if(s.charAt(i) == 'a') {
                startIdx = i;
                aflg = true;
                while(i + 1 < s.length() && s.charAt(i+1) == 'a') {
                    i++;
                }
                if(i + 1 < s.length() && s.charAt(i+1) != 'e') continue;
                while(i + 1 < s.length() && s.charAt(i+1) == 'e') {
                    eflg = true;
                    i++;
                }
                if(i + 1 < s.length() && s.charAt(i+1) != 'i') continue;
                while(i + 1 < s.length() && s.charAt(i+1) == 'i') {
                    iflg = true;
                    i++;
                }
                if(i + 1 < s.length() && s.charAt(i+1) != 'o') continue;
                while(i + 1 < s.length() && s.charAt(i+1) == 'o') {
                    oflg = true;
                    i++;
                }
                if(i + 1 < s.length() && s.charAt(i+1) != 'u') continue;
                while(i + 1 < s.length() && s.charAt(i+1) == 'u') {
                    uflg = true;
                    i++;
                }
                if(aflg && eflg && iflg && oflg && uflg) {
                    maxi = Math.max(maxi, i - startIdx + 1);
                }
            }
        }
        return maxi;
    }
}
