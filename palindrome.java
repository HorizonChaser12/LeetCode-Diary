//https://leetcode.com/problems/palindrome-number/description/
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
