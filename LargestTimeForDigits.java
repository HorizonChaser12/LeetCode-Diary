import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/largest-time-for-given-digits/description/

public class LargestTimeForDigits {
    public static void main(String[] args) {
        int[] arr ={2,0,6,5};
        System.out.println(largestTimeFromDigits(arr));
    }
    static String largestTimeFromDigits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        String digit1 = findMaxDigit(list, 2);
        if (digit1.isEmpty())
            return "";
        else {
            list.remove((Integer) Integer.parseInt(digit1));
        }

        String digit2 = findMaxDigit(list, (digit1.charAt(0) == '2') ? 3 : 9);
        if (digit2.isEmpty())
            return "";
        else {
            list.remove((Integer) Integer.parseInt(digit2));
        }

        String digit3 = findMaxDigit(list, 5);
        if (digit3.isEmpty())
            return "";
        else {
            list.remove((Integer) Integer.parseInt(digit3));
        }

        String digit4 = Integer.toString(list.get(0));

        return digit1 + digit2 + ":" + digit3 + digit4;
    }

    private static String findMaxDigit(List<Integer> list, int limit) {
        for (int i = limit; i >= 0; i--) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == i) {
                    return Integer.toString(list.get(j));
                }
            }
        }
        return "";
    }
}
