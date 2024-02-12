//https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/description/
public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String  s = "babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String ans="";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1 ;j >=0 ; j--) {
                if (s.charAt(i)==s.charAt(j)){
                    int k=i;
                    while(k<=j){
                        ans=ans+s.charAt(k);
                        k++;
                        count++;
                    }
                }
            }
        }
        return ans;
    }
}
