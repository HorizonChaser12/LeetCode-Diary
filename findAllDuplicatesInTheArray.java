import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findAllDuplicatesInTheArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> list=findDuplicates(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list=new ArrayList<>();
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                int temp = arr[correct];
//                arr[correct] = arr[i];
//                arr[i] = temp;
//            } else {
//                i++;
//            }
//        }
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] != index+1) {
//                list.add(arr[index]);
//            }
//        }
//        return list;



//        One key insight when reading the problem statement is this "the array elements will be in between 1<= a[i] <= n where n is the size of the array".
//
//                So, let's take this example:
//
//        2, 5, 2, 1, 1, 4
//
//        In here array size is 6. And we can clearly see all the elements inside the array are between 1 <= a[i] <= 6.
//
//        Some elements appeared twice while the other appeared one time.
//
//                By looking at it, we can see 2 and 1 appeared twice. [ On the other hand, we can also say 3 and 6 are missing. https://nextswe.com/leetcode-41-first-missing-positive/ ]
//
//        But what should be the approach for solving this one?
//
//                At this moment the first approach you should think is HashTable. Whenever we need to check something or look something up, we should always remember to bring our biggest hammer "HashTable" :).
//
//        Put all the elements in a hashtable and start checking whether that element is already in the hashtable or not. Easy. But it does have a cost in terms of space. We need O(n) time and O(n) space for this.
//
//                What if you are not allowed to use any extra space?
//
//                Can we think of something? What about sorting?
//
//                Sorting is another tool we can use, whenever we are dealing with numbers. Simply sort and sweep through the array. Whenever you find both previous and current values are the same put it in our result list. But, this will increase our complexity to O(N log N)[For in-place sorting we can not do better than O(N log N)].
//
//        What if we are asked to solve this without space, also in O(n) time. Can we do that?
//
//                Think in terms of on and off. Turning on and turning off a switch. If a switch is already turned on, you can not turn it on again.
//
//        Given this: [2,5,2,1,1,4]
//
//        Go to index 0 and flip whatever value index 0 pointing to[if it was not flipped(turned on) before]...
//
//        What does that mean?
//
//        Index 0 has value 2. Flip whatever 2 is pointing-to. Since the array is 0 based, so we will flip 2-1 = 1 and that is 5.
//
//        So, our result will look like:[2,-5,2,1,1,4]
//
//        Next, we will go to index 1. After modifying the array, value at index 1 might or might not become negative. So, for this, we get the absolute value of that position. So, flip(if it was not flipped before) whatever Math.abs(arr[1])-1 = 4 pointing to.
//
//        Since 4 is pointing to 1 and it is not negative(not flipped before), so we flip it to -1.
//
//                [2,-5,2,1,-1,4]
//
//        Next index 2, value 2, and it is pointing -5, which must be flipped by some other 2 in the array. So, we get our first duplicate value. Add 2 in our result and continue.
//
//        In this way, we will be able to find all the elements in the array that are duplicate.
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                ans.add(Math.abs(nums[i]));
            }
            else{
                nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1]*-1;
            }

        }
        return ans;
    }
}
