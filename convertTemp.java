import java.util.Arrays;
//https://leetcode.com/problems/convert-the-temperature/description/
public class convertTemp {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
    static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double Farenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin,Farenheit};
    }
}
