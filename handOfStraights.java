import java.util.Arrays;

public class handOfStraights {
    public static void main(String[] args) {
        int[] hands = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println(isNStraightHand(hands,groupSize));
    }
    static boolean isNStraightHand(int[] hand, int groupSize) {
        int max = 0;
        for (int i = 0; i < hand.length; i++) {
            max=Math.max(hand[i],max);
        }
        int[] freq = new int[max+1];
        for (int i = 0; i < freq.length; i++) {
            freq[hand[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        int group;
        for (int i = 1; i < freq.length; i++) {
            group = 0;
            while(group!=groupSize){
                if (freq[i]==0){
                    break;
                }
                freq[i]--;
                i++;
                group++;
            }
            System.out.println(Arrays.toString(freq));
        }
        return true;
    }
}
