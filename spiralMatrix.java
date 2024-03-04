import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20},
                {21,22,23,24},
        };
        System.out.println(spiralOrder(matrix));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
//      Okay for some reason this code below works for small matrix under the length of 4 or 3.Gotta use more brain power.
//        List<Integer> list = new ArrayList<>();
//        int i=0;
//        int j=0;
//        if (matrix.length==1){
//            while(j!=matrix[i].length){
//                list.add(matrix[i][j]);
//                j++;
//            }
//            return list;
//        } else if (matrix.length==0) {
//            return list;
//        }
//        for(i=0;i<matrix.length;){
//            for(j=0;j<matrix[i].length+1;j++){
//                if(i==matrix.length-1){
//                    j--;
//                    while(j!=0){
//                        j--;
//                        System.out.println(list);
//                        list.add(matrix[i][j]);
//                    }
//                        i--;
//                }
//                else if(j==matrix[i].length){
//                    i++;
//                    j--;
//                }
//                if (list.contains(matrix[i][j])){
//                    i=matrix.length;
//                    break;
//                }
//                System.out.println(list);
//                list.add(matrix[i][j]);
//            }
//        }
//        return list;
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return list;
        }
        int i = 0;
        int j = 0;
        if (matrix.length == 1) {
            while (j != matrix[i].length) {
                list.add(matrix[i][j]);
                j++;
            }
            return list;
        } else if (matrix.length == 0) {
            return list;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (list.size() < totalElements) {
            // Traverse top row
            for (j = left; j <= right && list.size() < totalElements; j++) {
                list.add(matrix[top][j]);
            }
            top++;

            // Traverse right column
            for (i = top; i <= bottom && list.size() < totalElements; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row
            for (j = right; j >= left && list.size() < totalElements; j--) {
                list.add(matrix[bottom][j]);
            }
            bottom--;

            // Traverse left column
            for (i = bottom; i >= top && list.size() < totalElements; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
}
