import java.util.ArrayList;
import java.util.Arrays;

public class productOfTheLastKNumbers {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        System.out.println(productOfNumbers.getProduct(2)); // return 20. The product of the last 2 numbers is 5 * 4 = 20
        System.out.println(productOfNumbers.getProduct(3)); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
        System.out.println(productOfNumbers.getProduct(4)); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        System.out.println(productOfNumbers.getProduct(2)); // return 32. The product of the last 2 numbers is 4 * 8 = 32
    }
    static class ProductOfNumbers {
        ArrayList<Integer> list;
        int[] prefixSum;
        public ProductOfNumbers() {
            list= new ArrayList<>();
            prefixSum=new int[list.size()];
            Arrays.fill(prefixSum,0);
            prefixSum[list.size()-1]=list.getLast();
            for(int i=list.size()-2;i>0;i--){
                prefixSum[i]=prefixSum[i+1]*list.get(i);
                if(prefixSum[i]==0){
                    break;
                }
            }
        }

        public void add(int num) {
            list.add(num);
        }

        public int getProduct(int k) {
            return prefixSum[list.size()-k];
        }
    }
}
