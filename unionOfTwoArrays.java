import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Using HashMaps
public class unionOfTwoArrays {
    public static void main(String[] args) {
        int[] a={5,10,15,5};
        int[] b={10,15,4,5};
        System.out.println(Arrays.toString(unionOf(a,b)));
    }
    static int[] unionOf(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index] = num;
            index++;
        }
        return result;
    }
}
