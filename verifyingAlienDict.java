import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/verifying-an-alien-dictionary/
public class verifyingAlienDict {
    public static void main(String[] args) {
        String[] words = {"kuvp","q"};
        String order = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println(isAlienSorted(words,order));
    }
    static boolean isAlienSorted(String[] words, String order) {
//      This was a pretty brute force nature approach which uses indexOf to find the correct position of each letter in the words.
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < order.length(); i++) {
            list.add(order.charAt(i));
        }
        for (int i = 0; i < words.length-1; i++) {
        int min = Math.min(words[i].length(),words[i+1].length());
        int j=0;
            while(j<min) {
                if (list.indexOf(words[i].charAt(j)) != list.indexOf(words[i + 1].charAt(j))) {
                    if (list.indexOf(words[i].charAt(j)) > list.indexOf(words[i + 1].charAt(j))) {
                        return false;
                    } else {
                        break;
                    }
                }
                j++;
            }
            if (j==min && words[i].length()> words[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
