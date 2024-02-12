//https://leetcode.com/problems/furthest-point-from-origin/
public class furthestPointFromOrigin {
    public static void main(String[] args) {
        String moves = "_R__LL_";
        System.out.println(furthestDistanceFromOrigins(moves));
    }
    static int furthestDistanceFromOrigins(String moves) {
        int Ls = 0, Rs = 0, Bs = 0;
        for(char c: moves.toCharArray()){
            if(c == 'L')    Ls++;
            else if(c == 'R')    Rs++;
            else    Bs++;
        }
        return Math.abs(Ls-Rs)+Bs;
    }
}
