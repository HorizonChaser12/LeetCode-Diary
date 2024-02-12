import java.util.*;
//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class countPairsLessThanTarget {
    public static void main(String[] args) {
        int target = 2;
        List<Integer> list =new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(countPairs(list,target));
    }
    static int countPairs(List<Integer> nums, int target) {
        int count=0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}
