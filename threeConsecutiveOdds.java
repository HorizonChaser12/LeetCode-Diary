//https://leetcode.com/problems/three-consecutive-odds/description/
public class threeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdd(arr));
    }

    static boolean threeConsecutiveOdd(int[] arr) {
        int fast = 0;
        int count = 0;
        while (fast < arr.length && count <= 3) {
            if (arr[fast] % 2 != 0) {
                count++;
            }
            else if (count!=0 && arr[fast]%2==0){
                count=0;
            }
            if (count == 3) {
                return true;
            }
            fast++;
        }
        return false;
    }
}
