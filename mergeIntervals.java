import java.util.*;
public class mergeIntervals {
    static void main() {
        int[][] arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] ans = merge(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print("[");
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {

        }
        int[][] ans = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                ans[i][j] = list.get(i).get(j);
            }
        }
        return ans;
    }
}
