//https://leetcode.com/problems/power-of-four/description/
public class powerOfFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 4 == 0) {
                n = n / 4;
            } else {
                return false;
            }
        }
        return true;
    }
}
