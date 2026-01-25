public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums, int target) {
        int pivot = 0;
        int start = 0;
        int end = nums.length-1;
        while (start<end){
            int middle = start + (end-start) / 2;
            if (nums[middle]>nums[end]) {
                start = middle+1;
            } else {
                end = middle;
            }
        }
        pivot = start;
        start = pivot;
        end = nums.length-1;
        while(start<end){
            int middle = start + (end-start) / 2;
            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]>target) {
                start = middle+1;
            }
        }
        return -1;
    }
}
