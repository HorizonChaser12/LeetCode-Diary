import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/set-matrix-zeroes/description/


public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix= {
                {0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1}
        };
        setZeroes(matrix);
    }
    static void setZeroes(int[][] matrix) {
        List<Integer> rowcount = new ArrayList<>();
        List<Integer> colcount = new ArrayList<>();

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(matrix[row][col]==0){
                    rowcount.add(row);
                    colcount.add(col);
                }
            }
        }
        for (Integer integer : rowcount) {
            Arrays.fill(matrix[integer], 0);
        }

        for(int i=0;i<matrix.length;i++){
            for (Integer integer : colcount) {
                matrix[i][integer] = 0;
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
