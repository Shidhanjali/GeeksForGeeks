/*public class BubbleSortCount {

    public static void  CountSwap(int arr[],int n)
    {
        for(int i=1 ; i<=n-1 ; i++) 
        {   
            for(int j=0 ; j<=n-2 ; j++)
            {
                if(arr[j] > arr[j+1])               
                 swap(j,j+1,arr);           
            }
        }
        return ;
    }
    public static void swap(int x, int y, int[] arr)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return ;
    }

public static void main(String args[]){
    int arr[]={2,3,4,1,6};
    //int result=CountSwap(arr, 5);
   System.out.println(result);

}
}
 */
import java.util.*;
public class BubbleSwapCount
 {
    private static int soltuion(int arr[], boolean mode) 
    {
        int count = 0;
        for (int i=0; i<arr.length-1; i++) 
        {
            for (int j=0; j<arr.length-i-1; j++)
             {
                if(mode) 
                {
                    if(arr[j]>arr[j+1]) 
                    {
                        count++;
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
                else{
                    if(arr[j] < arr[j + 1]) 
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        count++;
                    }
                }
            }
        }
        return count;
    }
     public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter thge no of elemrnyt:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element in array: ");
        for(int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }
        int asc = soltuion(arr.clone(), true);
        int desc = soltuion(arr.clone(), false);
        int ans=Math.min(asc, desc);

        System.out.println("No of swapping: "+ans);
        in.close();
        
    }
}
