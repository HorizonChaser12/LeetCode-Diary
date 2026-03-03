// https://leetcode.com/problems/search-a-2d-matrix/description/?envType=problem-list-v2&envId=matrix
public class search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        // int[][] matrix = {
        //     {1},
        //     {3}
        // };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target) {
                    row = i;
                    break;
                }
        }
        int start = 0;
        int end = matrix[row].length;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if (mid<matrix[row].length && matrix[row][mid]==target) {
                return true;
            }
            else if (mid<matrix[row].length && matrix[row][mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
