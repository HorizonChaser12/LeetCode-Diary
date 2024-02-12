//https://leetcode.com/problems/find-the-duplicate-number/description/

//Major Hint behind approaching this kind of intuition is because we have been given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//Basic intuition: swapping the number to where his index no. is and then traversing throughout the array to find the no. which isn't in its place then that no. is the duplicate no.



public class findTheDuplicateNo {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index+1) {
                    return index;
                }
            }
            return Integer.MAX_VALUE;
    }
}
