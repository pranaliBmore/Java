package math;
import java.util.*;

public class Median {
    public double calculate(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0)
        {
            return (arr[n / 2 - 1 ] + arr[n / 2]) / 2.0;
        }
        else
        {
            return arr[n / 2];
        }
    }
}