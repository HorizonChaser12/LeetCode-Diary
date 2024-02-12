
public class ransomeNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] char1=ransomNote.toCharArray();
        char[] char2=magazine.toCharArray();
        int count=0;
        for (char c : char1) {
            for (int j = 0; j < char2.length; j++) {
                if (c == char2[j]) {
                    count++;
                    char2[j] = '1';
                    break;
                }
            }
        }
        return count == ransomNote.length();
    }
}
