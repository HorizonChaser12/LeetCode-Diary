//https://www.codingninjas.com/studio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813?leftPanelTabValue=PROBLEM
public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr ={1,2,4,7};
        int m=9;
        System.out.println(searchInsert(arr,m));
    }
    static int searchInsert(int [] arr, int m){
        // Write your code here.
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]==m) {
                return mid;
            }
            if(m>arr[mid]){
                start=mid+1;
            }
            else if(m<arr[mid]){
                end=mid-1;
            }
        }
        return start;
    }
}
