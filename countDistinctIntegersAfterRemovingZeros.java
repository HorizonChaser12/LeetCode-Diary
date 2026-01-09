import java.util.HashSet;



public class countDistinctIntegersAfterRemovingZeros {
    public static void main(String[] args) {
        long n = 1000L;
        System.out.println(countDistinct(n));

    }
    static long countDistinct(long n) {
        HashSet<String> set = new HashSet<>();
        for (long i = 1L; i<=n; i++) {
            StringBuilder transformed = null;
            String numberinString = Long.toString(i);
            if (numberinString.contains("0")) {
                 transformed = new StringBuilder();
                for (int j = 0; j < numberinString.length(); j++) {
                    if (numberinString.charAt(j) != '0') {
                        transformed.append(numberinString.charAt(j));
                    }
                }
                set.add(transformed.toString());
            }
            else{
                set.add(numberinString);
            }
        }
        return set.size();
    }
}
