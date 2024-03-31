//https://leetcode.com/problems/palindrome-number/description/
//https://www.naukri.com/code360/problems/check-palindrome-recursive_624386?leftPanelTabValue=PROBLEM
public class palindrome {
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int r,sum=0;
        int temp=x;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        return temp == sum;
    }
}

//    Check palindrome or not using recursive approach.

//    public static boolean isPalindrome(String str) {
//        // Write your code here.
//        int start=0;
//        int end=str.length()-1;
//        return checkPalindrome(str, start, end);
//    }
//    static boolean checkPalindrome(String str,int start,int end){
//        if(start>end){
//            return true;
//        }
//        if(str.charAt(start)==str.charAt(end)){
//            return checkPalindrome(str,start+1,end-1);
//        }
//        return false;
//    }