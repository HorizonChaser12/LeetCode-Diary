//https://leetcode.com/problems/jewels-and-stones/description/
public class jewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i)==jewels.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
