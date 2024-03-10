//https://www.codingninjas.com/studio/problems/lower-bound_8165382?leftPanelTabValue=PROBLEM
public class implementLowerBound {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int x = 1;
        System.out.println(lowerBound(arr,x));
    }
    static int lowerBound(int []nums, int x) {
        // Write your code here
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==x){
                if (nums[mid]==nums[start]){
                    return Math.min(start,mid);
                }
                else{
                    return start;
                }
            }
            else if (nums[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
