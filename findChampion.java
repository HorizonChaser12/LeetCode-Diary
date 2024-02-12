//https://leetcode.com/problems/find-champion-i/description/
public class findChampion {
    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1},
                {1,0,1},
                {0,0,0},
        };
        System.out.println(findChampions(grid));
    }
    static int findChampions(int[][] grid) {
        int captain=0;
        int count;
        int[] freq = new int[grid.length];
        for (int row = 0; row < grid.length; row++) {
            count=0;
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col]==1){
                    count++;
                }
            }
            freq[row]=count;
        }
        int max=0;
        for (int i = 0; i < freq.length; i++) {
            if (max<freq[i]){
                max=freq[i];
                captain=i;
            }
        }
        return captain;
    }
}
