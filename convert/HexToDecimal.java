package convert;

public class HexToDecimal {

    public int convert(String hex) {
        return Integer.parseInt(hex, 16);
    }
}