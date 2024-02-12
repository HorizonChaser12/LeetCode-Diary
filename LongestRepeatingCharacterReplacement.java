//https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
       String s = "AABABBA";
       int k = 1;
        System.out.println(characterReplacement(s,k));
    }
    static int characterReplacement(String s, int k) {
        int len=0,R=0,L=0,n = s.length(),counter=0,max;
        while(R<n){
                if(s.charAt(R)=='B'){
                    counter++;
                }
                while(k<counter){
                    counter--;
                    L++;
                }
                max=R-L+1;
                len=Math.max(max,len);
                R++;
                }
        return len;
    }
}
