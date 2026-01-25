import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-absolute-difference/description/?envType=daily-question&envId=2026-01-26
public class minAbsoluteDiff {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            minAbs = Math.min(minAbs,Math.abs(arr[i] - arr[i+1]));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i-1];
            if (currentDiff == minAbs) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;
    }
}
