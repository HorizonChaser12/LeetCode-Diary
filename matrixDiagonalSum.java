//https://leetcode.com/problems/matrix-diagonal-sum/description/
public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                };
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        if (mat.length<=1){
            return mat[0][0];
        }
        int sum=0;
        int row=0;
        for (int col = 0; col < mat.length;col++) {
            sum=sum+mat[row][col];
            row++;
        }
        row=0;
        for (int col = mat.length-1; col >=0;col--) {
            sum=sum+mat[row][col];
            row++;
        }
        if (mat.length%2!=0){
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
