import java.util.Arrays;
//https://leetcode.com/problems/flipping-an-image/description/
public class flippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0},
        };
        int[][] ans=flipAndInvertImage(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+ ",");
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        // int y;
        // for(int row=0;row<image.length;row++){
        //     y=0;
        //     for(int col= image.length-1;col>0;col--){
        //         if(y<=col){
        //             int temp = image[row][y];
        //             image[row][y]= image[row][col];
        //             image[row][col]=temp;
        //             y++;
        //         }
        //     }
        // }
        // for (int row = 0; row < image.length; row++) {
        //     for (int col = 0; col < image.length; col++) {
        //         if(image[row][col]==1){
        //             image[row][col]=0;
        //         }
        //         else if(image[row][col]==0){
        //             image[row][col]=1;
        //         }
        //     }
        // }
        // return image;


        // 1ms runtime
        // int y = 0;
        // for(int i = 0;i<image.length;i++){
        //     y=image[i].length-1;
        //     for(int j=0;j<image[i].length;j++){
        //         if(y>=image[i].length/2) {
        //             int temp = image[i][j];
        //             image[i][j] = image[i][y];
        //             image[i][y] = temp;
        //             y--;
        //         }
        //         if (image[i][j]==0) {
        //             image[i][j]=1;
        //         }
        //         else{
        //             image[i][j]=0;
        //         }
        //     }
        // }
        // return image;


        // 0ms runtime
        for(int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while(left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }
}
