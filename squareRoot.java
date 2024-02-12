//https://leetcode.com/problems/sqrtx/description/
//Pretty basic approach which I failed to comprehend,Never thought that binary search can be used like this to search for a element.Need to think more.

public class squareRoot {
    public static void main(String[] args) {
        int x=9;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Math.pow(mid, 2) == x) {
                return mid;
            } else if (Math.pow(mid, 2) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
