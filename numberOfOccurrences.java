//https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?leftPanelTabValue=PROBLEM
public class numberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        int x=3;
        System.out.println(count(arr,x));
    }
    static int count(int arr[], int x) {
        //Your code goes here
        int start=0;
        int end=arr.length-1;
        int first=-1;
        int last=-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]==x){
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(first==-1){
            return 0;
        }
        start=0;
        end=arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                last = mid;
                start = mid + 1; // Move right to find the last occurrence
            }
            else if (arr[mid] < x) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return last-first+1;
    }
}
