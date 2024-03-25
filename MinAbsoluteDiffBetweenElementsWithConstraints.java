import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-absolute-difference-between-elements-with-constraint/description/
public class MinAbsoluteDiffBetweenElementsWithConstraints {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,3,2,10,15);
        int x = 1;
        System.out.println(minAbsoluteDifference(nums,x));
    }
    static int minAbsoluteDifference(List<Integer> nums, int x) {
//        Solutions pretty much use TreeSet to pass all the long test cases.
//        Even for the binary Search approach the need of tree set is specified.
//       passes 2008/2013 test cases
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=1;
        if (x==0){
            return 0;
        }
        while(right<nums.size()){
            while(right<nums.size()){
                if (Math.abs(left-right)>=x){
                    int number= Math.abs(nums.get(left)-nums.get(right));
                    min=Math.min(number,min);
                }
                right++;
            }
            left++;
            right=left+1;
        }
        return min;


//      passes 2010/2013 test cases
//        int n = nums.size();
//        int minDiff = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + x; j < n; j++) {
//                int diff = Math.abs(nums.get(i)-nums.get(j));
//                if (diff < minDiff) {
//                    minDiff = diff;
//                }
//            }
//        }
//
//        return minDiff == Integer.MAX_VALUE ? 0 : minDiff;
    }
}
