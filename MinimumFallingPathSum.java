//https://leetcode.com/problems/minimum-falling-path-sum/?envType=daily-question&envId=2024-01-19
public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {100,-42,-46,-41},
                {31,97,10,-10},
                {-58,-51,82,89},
                {51,81,69,-51}
        };
        System.out.println(minFallingPathSum(matrix));
    }
    static int minFallingPathSum(int[][] matrix) {
//      Cant be solved without using dynamic programming as we need to choose whether the numbers below the chosen numbers will come out to be smaller after we take it up as a sum. So we need to get back and check about every number at its sum.
        int sum=0;
        int min=Integer.MAX_VALUE;
        int minrow=0;
        int mincol=0;
        for(int row = 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[row].length;col++){
                if(matrix[row][col]<min){
                        min=matrix[row][col];
                        minrow=row;
                        mincol=col;
                }
            }
        }
        for(int row = 0;row<matrix.length;row++){
            for(int col = 0;col<matrix[row].length;col++) {

            }
        }
        System.out.println(min);
        return sum;

//        without using DP
//        for(int row = 1;row<matrix.length;row++){
//            for(int col = 0;col<matrix[row].length;col++){
//                int minPathSum =  matrix[row - 1][col];
//                if (col > 0) {
//                    minPathSum = Math.min(minPathSum, matrix[row - 1][col - 1]);
//                }
//                if (col < matrix[row].length - 1) {
//                    minPathSum = Math.min(minPathSum, matrix[row - 1][col + 1]);
//                }
//
//                matrix[row][col] += minPathSum;
//            }
//        }
//        int minSum = Integer.MAX_VALUE;
//        for (int value : matrix[matrix.length - 1]) {
//            minSum = Math.min(minSum, value);
//        }
//        return minSum;
    }

}
