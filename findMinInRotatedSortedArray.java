//https://www.naukri.com/code360/problems/rotated-array_1093219?leftPanelTabValue=PROBLEM
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class findMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,10};
//        int[] arr ={3 ,4 ,1 ,2 };
//        int[] arr ={35 ,43 ,45 ,1 ,2 ,9 ,12 ,13 ,19 ,20 ,26 ,28 ,29 ,32 };
        System.out.println(findMin(arr));
    }
    static int findMin(int []arr) {
        // Write your code here.
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start) / 2;
            if(arr[mid]<arr[end]){
                   end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
