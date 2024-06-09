import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findCommonCharacters {
    public static void main(String[] args) {
        String[]  words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }
    static List<String> commonChars(String[] words) {
        HashSet<Character> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    set.add(words[i].charAt(j));
                } else if (i == words.length - 1) {
                    list.add(String.valueOf(words[i].charAt(j)));
                } else {
                    if (!list.isEmpty()) {
                        list.remove(list.size());
                    }

                }
            }
        }
        return list;
    }
}
