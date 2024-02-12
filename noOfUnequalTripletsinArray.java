//https://leetcode.com/problems/number-of-unequal-triplets-in-array/description/
public class noOfUnequalTripletsinArray {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }
    static int unequalTriplets(int[] nums) {
//        int triplets = 0;
//        for (int i = 0; i < nums.length-2; i++) {
//            for (int j = i+1; j < nums.length-1; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k]){
//                        triplets++;
//                    }
//                }
//            }
//        }
//        return triplets;

//        Works far better than the above because it limits the search space
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]!=nums[j])
                {
                    for(int k=j+1;k<n;k++)
                    {
                        if(nums[j]!=nums[k]&& nums[k]!=nums[i])
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
