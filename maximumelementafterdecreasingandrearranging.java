import java.util.Arrays;
//https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/description/
public class maximumelementafterdecreasingandrearranging {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,1};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
    static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
//        Works at 8ms runtime and beats 22.14%
//        update:with a slight changes on the return part it now runs pretty good with 5ms and beats 95.71%
//        Arrays.sort(arr);
//        arr[0]=1;
//        int max=0;
//        if (arr.length==1){
//            max=arr[0];
//        }
//        for(int i=0;i<arr.length-1;i++){
//            if(Math.abs(arr[i] - arr[i + 1])>=1){
//                arr[i+1]=arr[i]+1;
//            }
//        }
//        return arr[arr.length-1];

//      Works ar 3ms and runs pretty efficient and uses the same logic but rather than finding the max element it just returns the last element of the array as it is sorted.
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] > 1){
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length-1];
    }
}
