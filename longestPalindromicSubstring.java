//https://leetcode.com/problems/longest-palindromic-substring/
public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String  s = "ccc";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
//        String ans="";
//        int count=0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = s.length()-1 ;j >=0 ; j--) {
//                if (s.charAt(i)==s.charAt(j)){
//                    int k=i;
//                    while(k<=j){
//                        ans=ans+s.charAt(k);
//                        k++;
//                        count++;
//                    }
//                }
//            }
//        }
//        return ans;

//      1836ms runtime time
        int left =0;
        int right =0;
        int max = Integer.MIN_VALUE;
        String ans = "";
        while(left!=s.length()){
            while(right!=s.length()){
                if(left+right>max && isPalindrome(left,right,s)){
                    if (s.substring(left,right+1).length()>ans.length()){
                        ans=s.substring(left,right+1);
                    }
                }
                right++;
            }
            left++;
            right=left+1;

        }
        return ans;
    }
    static boolean isPalindrome(int start,int end,String s){
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
