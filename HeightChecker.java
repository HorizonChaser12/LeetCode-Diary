import java.util.Arrays;

//https://leetcode.com/problems/height-checker/description/
public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }
    static int heightChecker(int[] heights) {
        int count=0;
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}
