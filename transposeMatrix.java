public class transposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int[][] ans = transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
//        int oldi = 0;
//        int oldj = 0;
//        for(int i = 0;i<ans.length;i++){
//            oldi = 0;
//            for (int j = 0; j < ans[i].length; j++) {
//                ans[i][j] = matrix[oldi][oldj];
//                oldi++;
//            }
//            oldj++;
//        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
