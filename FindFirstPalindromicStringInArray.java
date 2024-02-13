//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/?envType=daily-question&envId=2024-02-13
public class FindFirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindromic(words[i])){
                return words[i];
            }
        }
        return "";
    }
    static boolean isPalindromic(String str){
        int L=0,R=str.length()-1;
        while(L<=R){
            if(str.charAt(L)==str.charAt(R)){
                L++;
                R--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
