package convert;

public class OctalToDecimal {

    public int convert(String octal) {
        return Integer.parseInt(octal, 8);
    }
}