import java.util.Arrays;
//https://leetcode.com/problems/relative-sort-array/description/?envType=daily-question&envId=2024-06-11
public class relativeSortArray {
    public static void main(String[] args) {
        int[] arr1={26,21,11,20,50,34,1,18};
        int[] arr2 ={21,11,26,20};
        System.out.println(Arrays.toString(relativeSortArrays(arr1,arr2)));
    }
    static int[] relativeSortArrays(int[] arr1, int[] arr2) {
//       Brute Force Approach and works in O(n^2) time complexity.
        int k=0;
        for (int j = 0; j < arr2.length; j++) {
            for(int i=0;i<arr1.length;i++){
                if (arr1[i]==arr2[j]){
                    int temp = arr1[k];
                    arr1[k]=arr1[i];
                    arr1[i]=temp;
                    k++;
                }
            }
        }
        for (int i = k; i < arr1.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[index]) {
                    index = j;
                }
            }
            if (arr1[i]>arr1[index]){
                int temp = arr1[i];
                arr1[i] = arr1[index];
                arr1[index] = temp;
            }
        }
        return arr1;
    }
}
