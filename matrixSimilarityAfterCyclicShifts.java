import java.util.Arrays;
//https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/description/?envType=daily-question&envId=2026-03-27
public class matrixSimilarityAfterCyclicShifts {
    static void main() {
        int[][] mat = {
                {3,10,3,10,3,10,3,10},
                {5,8,5,8,5,8,5,8},
                {3,9,3,9,3,9,3,9},
                {3,8,3,8,3,8,3,8},
                {2,3,2,3,2,3,2,3}
        };
        int k = 2;
        System.out.println(areSimilar(mat, k));
    }
    static boolean areSimilar(int[][] mat, int k) {
        int[][] dup = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                dup[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
                if (i%2==0){
                    rotateArrLeft(mat[i],k);
                }
                else{
                    rotateArrRight(mat[i],k);
                }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(dup[i][j] != mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    static void rotateArrLeft(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }
    static void rotateArrRight(int[] arr, int d){
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[n-1];
            for (int j = n-1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = first;
        }
    }
}


