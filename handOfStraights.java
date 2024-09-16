import java.util.Arrays;
//https://leetcode.com/problems/hand-of-straights/description/
//Basically the last code here is the actual solution for all th values lying under the integer limit,and for further numbers we have to anyhow use hashmaps.
public class handOfStraights {
    public static void main(String[] args) {
        int[] hands = {8,10,12};
        int groupSize = 3;
        System.out.println(isNStraightHand(hands, groupSize));
    }

    static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        int[] freq = new int[hand[hand.length - 1] + 1];
        for (int i = 0; i < hand.length; i++) {
            freq[hand[i]]++;
        }
        for (int i = 0; i < hand.length; i++) {
            if (freq[hand[i]] == 0) {
                continue;
            }

            for (int j = 0; j < groupSize; j++) {
                if (hand[i] + j >= freq.length || freq[hand[i] + j] == 0) {
                    return false;
                }
                freq[hand[i] + j]--;
            }
        }
        return true;
    }
}
