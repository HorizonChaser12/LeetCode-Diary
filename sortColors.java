//https://leetcode.com/problems/sort-colors/
public class sortColors {
    public static void main(String[] args) {
        int[] nums={2,0,1};
        sortColor(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void sortColor(int[] nums) {
        int r=0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i]==0){
               int temp=nums[r];
               nums[r]=nums[i];
               nums[i]=temp;
               r++;
           }
        }
        int t=r;
        for (int i = r; i < nums.length; i++) {
            if (nums[i]==1){
                int temp=nums[t];
                nums[t]=nums[i];
                nums[i]=temp;
                t++;
            }
        }
    }
}
