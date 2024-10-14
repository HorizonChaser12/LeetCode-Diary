//https://leetcode.com/problems/construct-product-matrix/description/
//The problem statement is kinda same like that of productOFArratExceptSelf but there was some mistake in the calculation of the modulo stuff which I got fixed using chatGPT. I need to learn more about using prefix sum and suffix sum as its being used more commonly in these type of problems.

public class constructProductMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,9},
                {3,9,10},
                {9,7,8},
                {8,4,7},
                {6,1,3},
        };
        int[][] ans = constructProductMatrixs(grid);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
    static int[][] constructProductMatrixs(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int n = rows * cols;
        long[] nums = new long[n];
        int k = 0;

        // Flatten the grid into nums
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[k] = grid[i][j];
                k++;
            }
        }

        // Initialize prefix and suffix arrays
        long[] prefix = new long[n];
        long[] suffix = new long[n];

        // Calculate prefix products
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = (prefix[i - 1] * nums[i - 1]) % 12345;
        }

        // Calculate suffix products
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] * nums[i + 1]) % 12345;
        }

        // Calculate the final product for each cell
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                long product = (prefix[k] * suffix[k]) % 12345;
                // Ensure the result is non-negative
                if (product < 0) {
                    product += 12345;
                }
                grid[i][j] = (int) product;
                k++;
            }
        }
        return grid;
    }
}
