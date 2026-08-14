package math;

public class Mean {
    public double calculate(int arr[]) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}