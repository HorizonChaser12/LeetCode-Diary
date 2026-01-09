import java.util.Scanner;

public class iLoveUsername {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = SC.nextInt();
        }
        System.out.println(username(scores));
    }
    static  int username(int[] scores){
        int max = scores[0];
        int min = scores[0];
        int ans = 0;
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>max){
                max=scores[i];
                ans++;
            }
            else if (scores[i]<min){
                min=scores[i];
                ans++;
            }
        }
        return  ans;
    }
}
