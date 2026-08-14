package math;

 public class Standard_Deviation {
    public double calculate(int arr[])
    {
        double mean = 0;
        for (int i = 0; i < arr.length; i++)
        {
            mean += arr[i];
        }
        mean = mean / arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += Math.pow(arr[i] - mean, 2);
        }
        return Math.sqrt(sum / arr.length);
    }
 }