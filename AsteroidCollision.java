import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids={10,2,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
    static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            list.add(asteroids[i]);
        }
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)>0 && list.get(i+1)>0){
                continue;
            }
            else if (list.get(i)>0 && list.get(i+1)<0) {
                    list.remove(Math.min(list.get(i),(list.get(i+1)*-1)));
                    i=0;
            }
        }
        int[] ans= new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=list.get(i);
        }

        return ans;
    }
}
