import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/description/
public class coloredPiecesRemove {
    public static void main(String[] args) {
        String colors = "ABBBBBBBAAA";
        System.out.println(winnerOfGame(colors));
    }
    static boolean winnerOfGame(String colors) {
        int alice=0;
        int bob=0;
        for (int i = 1; i < colors.length()-1; i++) {
            if (colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                if (colors.charAt(i)=='A'){
                    alice++;
                }
                else {
                    bob++;
                }
            }
        }
        return alice > bob;
    }
}
