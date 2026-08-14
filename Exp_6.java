import math.*;
import math.convert.*;

public class Main {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        Mean mean = new Mean();
        Average avg = new Average();
        Median median = new Median();
        StandardDeviation sd = new StandardDeviation();

        System.out.println("Mean = " + mean.calculate(arr));
        System.out.println("Average = " + avg.calculate(arr));
        System.out.println("Median = " + median.calculate(arr));
        System.out.println("Standard Deviation = " + sd.calculate(arr));

        DecimalToBinary db = new DecimalToBinary();
        DecimalToOctal dob = new DecimalToOctal();
        DecimalToHex dh = new DecimalToHex();

        BinaryToDecimal bd = new BinaryToDecimal();
        OctalToDecimal od = new OctalToDecimal();
        HexToDecimal hd = new HexToDecimal();

        int num = 25;

        System.out.println("\nConversions of " + num);

        System.out.println("Binary : " + db.convert(num));
        System.out.println("Octal  : " + dob.convert(num));
        System.out.println("Hex    : " + dh.convert(num));

        System.out.println("\nReverse Conversions");

        System.out.println("11001 -> " + bd.convert("11001"));
        System.out.println("31 -> " + od.convert("31"));
        System.out.println("19 -> " + hd.convert("19"));
    }
}