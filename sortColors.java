import java.util.Arrays;

//https://leetcode.com/problems/sort-colors/
public class sortColors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColor(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void sortColor(int[] nums) {
//        int r=0;
//        for (int i = 0; i < nums.length; i++) {
//           if (nums[i]==0){
//               int temp=nums[r];
//               nums[r]=nums[i];
//               nums[i]=temp;
//               r++;
//           }
//        }
//        int t=r;
//        for (int i = r; i < nums.length; i++) {
//            if (nums[i]==1){
//                int temp=nums[t];
//                nums[t]=nums[i];
//                nums[i]=temp;
//                t++;
//            }
//        }
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[index1];
                nums[index1] = nums[i];
                nums[i] = temp;
                index1++;
            }
        }
        index2 = index1;
        for(int i=index1;i<nums.length;i++){
            if(nums[i]==1){
                int temp = nums[index2];
                nums[index2] = nums[i];
                nums[i] = temp;
                index2++;
            }
        }
    }
}
