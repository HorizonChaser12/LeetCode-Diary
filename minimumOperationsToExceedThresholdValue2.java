//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minimumOperationsToExceedThresholdValue2 {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums,k));
    }
    static int minOperations(int[] nums, int k) {
//      669 / 675 testcases passed. It is recommended to use priority queue to get all the test cases passed.
//        https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/solutions/6415396/better-than-queueheap-beats-10000-runtim-tjzq/
//        This is one hell of a unique solution that nobody could have thought of.
//        ArrayList<Long> list = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            list.add((long)nums[i]);
//        }
//        int index=0;
//        int count=0;
//        while(index<list.size()){
//            Collections.sort(list);
//            if(list.get(index)<k){
//                long small= list.get(0);
//                long secondsmall= list.get(1);
//                long add = small*2+secondsmall;
//                list.removeFirst();
//                list.removeFirst();
//                list.add(add);
//                count++;
//                continue;
//            }
//            index++;
//        }
//        return count;

        Arrays.sort(nums);
        List<Integer> b = new ArrayList<>();
        for (int i = 0, j = 0, count = 0, x, y; ; ++count) {
            if (i < nums.length && (j >= b.size() || nums[i] <= b.get(j))) x = nums[i++];
            else x = b.get(j++);
            if (x >= k) return count;
            if (i < nums.length && (j >= b.size() || nums[i] <= b.get(j))) y = nums[i++];
            else y = b.get(j++);
            long t = 2L * x + y; // test overflow
            b.add(t < k ? (int) t : k);
        }
    }
}
