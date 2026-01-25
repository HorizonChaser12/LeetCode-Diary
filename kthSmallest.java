import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmalleste(arr,k));
    }
    static int kthSmalleste(int[] arr, int k) {
        // Code here
        int low = 0;
        int high = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int pivot = partition(arr,low,high);
            if (pivot == k-1){
                return arr[k-1];
            } else if (pivot > k-1) {
                high = pivot -1;
            }
            else {
                low = pivot+1;
            }
        }
        return -1;
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high] ;
        int index = low;
        for (int i = low; i < high; i++) {
            if (arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        return index;
    }
}
