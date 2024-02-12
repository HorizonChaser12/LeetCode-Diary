import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/
public class largestNumAfterDigitSwap {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(largestInteger(n));
    }
    static int largestInteger(int num) {
        int ans=0;
        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            int temp = num % 10;
            list.add(temp);
            num = num / 10;
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    if (list.get(i) % 2 != 0 && list.get(j) % 2 != 0) {
                        Collections.swap(list,i,j);
                    }
                    if (list.get(i) % 2 == 0 && list.get(j) % 2 == 0) {
                        Collections.swap(list,i,j);
                    }
                }
            }
        }
        for (int integer : list) {
            ans = ans * 10 + integer;
        }
        return ans;
    }
}
