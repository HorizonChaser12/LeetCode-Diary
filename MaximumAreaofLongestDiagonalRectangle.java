//https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
public class MaximumAreaofLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][] dimensions = {
         {6,5},{8,6},{2,10},{8,1},{9,2},{3,5},{3,5},
        };
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
    static int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;
        int maxarea=0;
        for(int i=0;i<dimensions.length;i++){
            double diagonal = Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if( diagonal > max || (diagonal == max && dimensions[i][0] * dimensions[i][1] > maxarea)){
                max=Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
                maxarea=dimensions[i][0]*dimensions[i][1];

            }
        }
        return maxarea;
    }
}
