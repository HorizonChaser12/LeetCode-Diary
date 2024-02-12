//https://leetcode.com/problems/valid-perfect-square/
public class validPerfectSquare {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPerfectSquare(n));
    }

    public static boolean isPerfectSquare(int num) {
        int l = 1, h = num;
        while (l <= h) {
            long m = l + (h - l) / 2;
            if (m * m == num)
                return true;
            else if (num < m * m)
                h = (int) m - 1;
            else
                l = (int) m + 1;
        }
        return false;
    }
}