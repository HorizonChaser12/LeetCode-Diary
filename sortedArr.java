import java.util.*;

public class sortedArr {
    public static void main(String[] args) {
        int[] a={1,2,3,3};
        int[] b={2,2,4};
        List<Integer> arr=sortedArray(a,b);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List <Integer> list= new ArrayList<>();
        int element=0;
        for (int k : a) {
            list.add(k);
        }
        for (int k : b) {
            list.add(k);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(Objects.equals(list.get(i), list.get(j))){
                    element=list.get(i);
                }
                if (!list.contains(element)){
                    list.remove(element);
                }
            }
        }
        return list;
    }
}
