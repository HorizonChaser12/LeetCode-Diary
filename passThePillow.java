//https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06
//Had to look at the hints and discussion page but finally found the way. It's a simple math riddle.
public class passThePillow {
    public static void main(String[] args) {
        int n = 18;
        int time = 38;
        System.out.println(passThePillows(n,time));
    }
    static int passThePillows(int n, int time) {
        int pillow = 1;
        int direction = 1;
        int ct = 1;
        while(ct<time+1){
            pillow+=direction;
            ct++;
            if(pillow==n){
                direction=-1;
            }
            if (pillow==1){
                direction=1;
            }

        }
        return pillow;
    }
}
