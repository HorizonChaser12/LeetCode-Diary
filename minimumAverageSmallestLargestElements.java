import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/
public class minimumAverageSmallestLargestElements {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        System.out.println(minimumAverage(nums));
    }
    static double minimumAverage(int[] nums) {
        ArrayList<Double> list = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            list.add((double)(nums[i]+nums[j])/2);
            i++;
            j--;
        }
        double small = Float.MAX_VALUE;
        for(int k =0;k<list.size();k++){
            small=Math.min(list.get(k),small);
        }
        return small;
    }
}
