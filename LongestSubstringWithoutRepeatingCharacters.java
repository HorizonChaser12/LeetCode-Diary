import java.util.HashMap;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String  s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        int L=0;
        int R=0;
        int n= s.length();
        int len = Integer.MIN_VALUE;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(R<n){
            hm.put(s.charAt(R),hm.getOrDefault(s.charAt(R),0)+1);
            while(hm.size()!=R-L+1){
                hm.put(s.charAt(L), hm.get(s.charAt(L))-1);
                if(hm.get(s.charAt(L))==0){
                    hm.remove(s.charAt(L));
                }
                L++;
            }
            len=Math.max(len,R-L+1);
            R++;
        }
        return len;
    }
}
