package math.convert;

public class DecimalToHex {

    public String convert(int n) {
        return Integer.toHexString(n).toUpperCase();
    }
}