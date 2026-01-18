//https://leetcode.com/problems/maximize-distance-to-closest-person/description/

public class maximizeDistanceToClosestPerson {
    public static void main(String[] args) {
        int[] seats = {1,0,0,0};
        int[] seats2= {0,0,0,1};
        System.out.println(maxDistToClosest(seats2));
    }
    static int maxDistToClosest(int[] seats) {
        int ans = 0;
        int pointer1 = 0;
        int pointer2= 0;
//        leading zeroes
        while (pointer2<seats.length && seats[pointer2]==0){
                pointer2++;
            }
        ans=pointer2;

        pointer1=pointer2;

//        middle zeroes
        while (pointer2<seats.length){
            if(seats[pointer2]==1){
                ans = Math.max(ans,(pointer2-pointer1)/2);
                pointer1=pointer2;
            }
            pointer2++;
        }

//        trailing zeroes
        ans = Math.max(ans, pointer2 - pointer1 - 1);

        return ans;
    }
}
