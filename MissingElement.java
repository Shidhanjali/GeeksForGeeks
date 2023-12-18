import java.util.*;
 public class MissingElement{
    public static int findMissingNumber(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length+1;         //expected number of elements in array
        int total_sum=(n*(n+1))/2;

        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];       
        }
        int result = total_sum - sum;
        return result;
    }
    public static void main(String args[])
    {
        int arr[]={6, 1, 2, 5, 9, 4, 3, 10, 7};
        
        int res = findMissingNumber(arr);
        System.out.println("Missing number:" + res);

    }
}