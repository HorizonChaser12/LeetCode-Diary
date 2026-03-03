// https://leetcode.com/problems/reshape-the-matrix/?envType=problem-list-v2&envId=matrix

public class reshapeTheMatrix {
    public static void main(String[] args) {
        int[][]mat = {{1,2},{3,4}};
        int r = 4 ;
        int c = 1;
        int[][] ans = matrixReshape(mat, r, c);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int index1 = 0;
        int index2 = 0;
        if(mat[0].length*mat.length != r*c){
            return mat;
        }
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                ans[index1][index2] = mat[i][j];
                index2++;
                if(index2>=c){
                    index1++;
                    index2 = 0;
                }
            }
        }
        return ans;
    }
    
}
