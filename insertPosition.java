public class insertPosition {
    public static void main(String[] args) {
        int[] arr={-1,3,5,6};
        int target=0;
        int realans=searchInsert(arr,target);
        System.out.println(realans);
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start + (end-start) /2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
//        if(target==0){
//            return 0;
//        }
//        else if(nums[0]<0){
//            return 1;
//        }
        return start;
    }
}
