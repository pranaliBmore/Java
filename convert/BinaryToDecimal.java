package convert;

public class BinaryToDecimal {

    public int convert(String binary) {
        return Integer.parseInt(binary, 2);
    }
}