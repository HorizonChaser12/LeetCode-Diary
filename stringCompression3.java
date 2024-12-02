//https://leetcode.com/problems/string-compression-iii/description/
public class stringCompression3 {
    public static void main(String[] args) {
        String word = "ithinkitsfunnythatthecompressionmakesthestringlongerforanaverageenglishtext";
        System.out.println(compressedString(word));
    }

    static String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int index = 0;
        while (index<word.length()){
            int times = 0;
            char currchar = word.charAt(index);
            while (index<word.length() && word.charAt(index)==currchar){
                times++;
                index++;
                if (times==9){
                    break;
                }

            }
            comp.append(times).append(currchar);
        }
        return comp.toString();
    }
}
