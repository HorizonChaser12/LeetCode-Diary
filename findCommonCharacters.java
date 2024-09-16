import java.util.*;
//https://leetcode.com/problems/find-common-characters/description/
//Dogsheet Question but can only be solved easily using Hashtable but the approach without it is more complicated. I couldn't find a viable solution but anyhow I did copy stuff from solution and wrote it down.
public class findCommonCharacters {
    public static void main(String[] args) {
        String[]  words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }
    static List<String> commonChars(String[] words) {
//       I will try to make it undestand as well type my thinking.

//       So the thing that happens here is.
//        First the user takes the first word as an initiator and then sorts it.
//        After that in the for loop it examines each character(also sorted) and uses 2 pointer to increase the pointer such that a character which is higher than the characters present in the other word doesnt miss out.
//        After that it overwrites all the found characters that are present in the List and then again the loop continues and now its even smaller,due to the overwriting.
        char[] common = words[0].toCharArray();
        Arrays.sort(common);
        for(int i=0;i<words.length;i++){
            char[] word = words[i].toCharArray();
            Arrays.sort(word);
            int lp = 0, rp = 0;
            List<Character> newCommon = new ArrayList<>();
            while (lp < common.length && rp < word.length) {
                if (common[lp] == word[rp]) {
                    newCommon.add(common[lp]);
                    lp++;
                    rp++;
                } else {
                    if (common[lp] < word[rp]) lp++;
                    else rp++;
                }
            }
            common = new char[newCommon.size()];
            for (int j = 0; j < common.length; j++) {
                common[j] = newCommon.get(j);
            }
        }
        List<String> result = new ArrayList<>();
        for (char c : common) {
            result.add(Character.toString(c));
        }
        return result;
    }
}
