//https://leetcode.com/problems/majority-element-ii/
//has a high runtime,have to learn the approach of solving it efficiently

import java.util.*;

public class majorityEle2 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,2,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        List<Integer> list= majorityElement(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        int count;
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            count=0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count>=nums.length/3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
