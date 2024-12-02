//https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/solutions/6046115/find-prefix-suffix-non-decreasing-then-2-pointers-0msbeats-100/
//Couldn't actually figure it out how to solve the problem,the above solution did give me a hint but with fail I couldn't solve it, although I had the idea of how he was solving it.Do read the solution next time.
//https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
public class shortestSubarrayToBeRemovedToMakeArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,2,3,5};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
    static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0,right=arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            if (left==arr.length-1){
                return 0;
            }
            if (arr[i+1]>=arr[i]){
                left=i;
            }
            else {
                break;
            }
        }
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]<=arr[i-1]){
                right=i;
            }
        }
        return Math.min(n-left-1,right);
    }
}
