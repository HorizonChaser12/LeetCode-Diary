//https://leetcode.com/problems/valid-palindrome/

import java.util.ArrayList;

public class validPalindrome {
    public static void main(String[] args){
        String s="0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        ArrayList<Character> char1=new ArrayList<>();
        ArrayList<Character> char2=new ArrayList<>();
        s=s.toLowerCase();
        for (int i = 0;i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                char1.add(s.charAt(i));
            }
        }
        for (int i = char1.size()-1; i>=0; i--) {
            char2.add(char1.get(i));
        }
        return char1.equals(char2);
    }
}
