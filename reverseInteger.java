//https://leetcode.com/problems/reverse-integer/description/
public class reverseInteger {
    public static void main(String[] args) {
        int n= -2147483648;
        System.out.println(reverse(n));
    }
    static int reverse(int n) {
        int reversed = 0;
        while (n!=0) {
            int temp = n % 10;
            reversed = reversed <= Integer.MAX_VALUE/10 &&  reversed > Integer.MIN_VALUE/10? reversed * 10 + temp : 0;
            n = n / 10;
        }
        return reversed;
    }
}
