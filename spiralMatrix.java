import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        spiralOrder(matrix);
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =  new ArrayList<>();
        for (int row = 0; row < matrix.length ;row ++) {
            for (int col = 0; col < matrix[row].length; col++) {
                list.add(matrix[row][col]);
            }
        }
        return list;
    }
}
