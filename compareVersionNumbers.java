//https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2024-05-03
public class compareVersionNumbers {
    public static void main(String[] args) {
        String version1 = "1.0.1";
        String version2 = "1";
        System.out.println(compareVersion(version1,version2));
    }
    static int compareVersion(String version1, String version2) {
        String[] one = version1.split("[.]");
        String[] two = version2.split("[.]");
        for (int i = 0; i < Math.max(one.length,two.length); i++) {
            int num1 = i<one.length ? Integer.parseInt(one[i]) : 0;
            int num2 = i<two.length ? Integer.parseInt(two[i]) : 0;
            if (num1>num2){
                return 1;
            }
            if (num1<num2){
                return -1;
            }
        }
        return 0;
    }
}
