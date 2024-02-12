import java.util.HashMap;

public class countNoOfBadPairs {
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
    static long countBadPairs(int[] nums) {
//      Brute Force Approach works for 58/65 test cases but has a O(n^2) complexity
//        long count = 0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(j-i != nums[j]-nums[i]){
//                    count++;
//                }
//            }
//        }
//        return count;

//      Use of HashMap and O(n) complexity passes all the test cases and it actually better.
        long n = nums.length;
        HashMap<Integer,Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int s = i-nums[i];
            map.put(s,map.getOrDefault(s,0L)+1);
        }
        long count=0;
        for(long k : map.values()){
            if(k>1){
                count += k*(k-1)/2;
            }
        }
        long pairs =(n*(n-1)/2);
        pairs-=count;
        return pairs;
    }
}
