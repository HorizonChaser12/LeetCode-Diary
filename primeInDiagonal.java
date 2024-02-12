//https://leetcode.com/problems/prime-in-diagonal/
public class primeInDiagonal {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,4},
                {5,1,7},
                {3,17,10},
        };
        System.out.println(diagonalPrime(arr));
    }
    public static int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                if (row == col || row + col == nums.length - 1) {
                    int num = nums[row][col];
                    if (num > max && isPrime(num)) {
                        max = num;
                    }
                }
            }
        }
        return max;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
