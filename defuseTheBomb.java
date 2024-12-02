import java.util.Arrays;
//https://leetcode.com/problems/defuse-the-bomb/description/
public class defuseTheBomb {
    public static void main(String[] args) {
        int[] code = {1,2,3,4};
        int k = 0;
        System.out.println(Arrays.toString(decrypt(code, k)));
    }

    static int[] decrypt(int[] code, int k) {
        int fast;
        int slow = 0;
        int[] ans = new int[code.length];
        if (k == 0) {
            return ans;
        }
        int index;
        if (k > 0) {
            while (slow < code.length) {
                index = 0;
                fast = slow + 1;
                while (index < k) {
                    if (fast == code.length) {
                        fast = 0;
                    }
                    ans[slow] += code[fast];
                    fast++;
                    index++;
                }
                slow++;
            }
        } else {
            while (slow < code.length) {
                index = 0;
                fast = slow-1;
                while (index < Math.abs(k)) {
                    if (fast < 0) {
                        fast = code.length - 1;
                    }
                    ans[slow] += code[fast];
                    fast--;
                    index++;
                }
                slow++;
            }
        }
        return ans;
    }
}
