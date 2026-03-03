import java.util.Arrays;
// https://leetcode.com/problems/rotate-image/description/
public class rotateImage {
    public static void main(String[] args) {
       int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
       };
       rotate(matrix);
       System.out.println(Arrays.deepToString(matrix));
    
    }
    static void rotate(int[][] matrix) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            int col = matrix[i].length-1;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[row][col] = matrix[i][j];
                row++;
                col--;
            }
        }
    }
}
