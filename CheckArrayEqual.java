import java.util.*;
public class CheckArrayEqual {
    public static boolean check(long arr1[],long arr2[],int n)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<n; i++)
        {
            if(arr1[i]!=arr2[i])
            return false;   
        }
        return true;

    }
    public static void main(String args[]){
        long arr1[]={1,4,5,6,8};
        long arr2[]={5,6,4,1,9};
        int n=arr1.length;
      //  if (check(arr1, arr2, n))
      //  System.out.println("Yes");
        //else
       // System.out.println("No");

        System.out.println(check(arr1,arr2,n));
    }
    
}
