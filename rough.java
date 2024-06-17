import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class rough {
    // Driver code
    public static void main(String[] args) {
        int[] hours = {7,1,6,3};
        System.out.println(code(hours));
    }

    static int code(int[] power) {
        int maxDamage = 0;
        int max = power[power.length-1];
        int lastIncludedDamage = Integer.MIN_VALUE;
        for (int i = power.length-1; i >= 0; i--) {
            if ((power[i] > lastIncludedDamage + 2 || power[i] < lastIncludedDamage - 2 || power[i]==lastIncludedDamage) && power[i]<=max) {
                maxDamage += power[i];
                lastIncludedDamage = power[i];
                max=Math.max(max,power[i]);
            }
        }
        return maxDamage;
    }

}


//1,4,6,5,18,9,12
//output {1,4},{4,6},{6,18},{5,18},{9,12},{18,-1},{12,-1}