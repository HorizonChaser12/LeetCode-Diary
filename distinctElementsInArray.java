import java.util.HashSet;
import java.util.Set;

//Using HashMap
public class distinctElementsInArray {
    public static void main(String[] args) {
        int[] a={5,10,15,5,4,5};
        System.out.println(countDistinct(a));
    }
    static int countDistinct(int[] a){
        Set <Integer> set =new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return set.size();
    }
}
