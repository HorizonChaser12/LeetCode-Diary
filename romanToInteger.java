//https://leetcode.com/problems/roman-to-integer/
public class romanToInteger {
    public static void main(String[] args) {
        String s="IV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
//      Basically it's a very wise utilisation of switch case. It uses the description to match the number and then uses comparison to whether decrease the number or increase.
//      For example this no "IV" V(5) first which is greater than I(1).So it is subtracted.
//      Another example is "VI" I is smaller so its is added to V.
//      Simple yet beautiful logic.
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
