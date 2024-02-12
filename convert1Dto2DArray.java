import java.util.Arrays;

//https://leetcode.com/problems/convert-1d-array-into-2d-array/
public class convert1Dto2DArray {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m=2;
        int n=2;
        System.out.println(Arrays.toString(construct2DArray(original,m,n)));
    }
    static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return new int[][]{};
        }
        int[][] ans = new int[m][n];
        int pointer=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=original[pointer];
                pointer++;
            }
        }
        return ans;
    }
}
