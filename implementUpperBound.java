//https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?leftPanelTabValue=PROBLEM
public class implementUpperBound {
    public static void main(String[] args) {
        int[] nums= {1,2,5,6,10};
        int x =10;
        System.out.println(upperBound(nums,x));
    }
    static int upperBound(int []nums, int x){
        // Write your code here.
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==x){
                while(mid<nums.length && nums[mid]<=x){
                    mid++;
                }
                return mid;
            }
            if (nums[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
