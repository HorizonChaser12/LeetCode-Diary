//https://leetcode.com/problems/string-compression/description/
//Took a little bit of help from the solution page to figure out the way the expected answer is being evaluated on. Otherwise, I did make the logic by myself.
public class stringCompression1 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    static int compress(char[] chars) {
        int index = 0;
        int charindex = 0;
        while (index<chars.length){
            int times = 0;
            char currchar = chars[index];
            while (index<chars.length && chars[index]==currchar){
                times++;
                index++;
            }
            if (times==1){
                chars[charindex]=currchar;
                charindex++;
            }
            else {
                chars[charindex]=currchar;
                charindex++;
                chars[charindex]=Character.forDigit(times,10);;
                charindex++;
            }
        }
        return chars.length;
    }
}
