//https://leetcode.com/problems/path-crossing/
public class PathCrossing {
    public static void main(String[] args) {
        String path = "NES";
        System.out.println(isPathCrossing(path));
    }
    static boolean isPathCrossing(String path) {
//      A pretty powerful question which pushes your intuition to think how to comprehend the question.This answer is not mine and i will definitely find a solution to it on my own. This runs in 3ms time complexity and is O(n^2).
        int n = path.length();
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++) {
            int tempX = x;
            int tempY = y;
            for(int j=i;j<n;j++) {
                char ch = path.charAt(j);
                if(ch == 'N') y++;
                else if(ch == 'S') y--;
                else if(ch == 'W') x--;
                else x++;
                if(x == tempX && y == tempY) return true;
            }
        }
        return false;
    }
}
