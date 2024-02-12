//https://leetcode.com/problems/contains-duplicate-ii/description/
//Accepted but runtime is too high,using hash map is the only way to reduce its complexity and have a good runtime!
public class containsDuplicate2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int limit = Math.min(i + k, n - 1);
            for (int j = i + 1; j <= limit; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
