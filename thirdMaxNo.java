import java.util.*;
//https://leetcode.com/problems/third-maximum-number/description/
public class thirdMaxNo {
    public static void main(String[] args) {
        int[] arr = {5,2,2};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
//        High runtime but adjustable
//        List<Integer> set= new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.contains(nums[i])){
//                set.add(nums[i]);
//            }
//        }
//        set.sort(Collections.reverseOrder());
//        if (set.size()>=3){
//            return set.get(2);
//        }
//        return set.get(0);

//        Better runtime(1ms)
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

        for(int num: nums) {
            if(first == num || second == num || third == num) {
                continue;
            }

            if(num >= first) {
                third = second;
                second = first;
                first = num;
            } else if(num >= second) {
                third = second;
                second = num;
            } else if(num > third) {
                third = num;
            }
        }
        return third == Long.MIN_VALUE ? (int)first: (int)third;
//
//        5ms runtime with hashset
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        List<Integer> sortedSet = new ArrayList<>(set);
//
//        sortedSet.sort(Comparator.reverseOrder());
//        if (set.size() >= 3) {
//            return sortedSet.get(2);
//        }
//        return sortedSet.get(0);
    }
}
