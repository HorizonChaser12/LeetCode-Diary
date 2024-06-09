//https://leetcode.com/problems/remove-covered-intervals/description/
public class removeCoveredIntervals {
    public static void main(String[] args) {
        int[][] nums = {
                {1,4},
                {3,6},
                {2,8},

        };
//        int[][] ans = removeCoveredIntervalss(nums);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[i].length; j++) {
//                System.out.println(ans[i][j]);
//            }
//        }
        System.out.println(removeCoveredIntervalss(nums));
    }

    static int removeCoveredIntervalss(int[][] intervals) {
        int count = 0 ;
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for (int j = 0; j < intervals.length; j++) {
                int c = intervals[j][0];
                int d = intervals[j][1];
                if (i != j && c <= a && b <= d) {
                    count++;
                    break;
                }

            }
        }
        return intervals.length-count;
    }
}
