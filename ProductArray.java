public class ProductArray {
    public static long product(int arr[], int n)
    {
        long product=1;
        for(int i=0;i<n;i++){
            product=product*arr[i];
        }
        return (long)product;
    }
    public static void main(String args[]){
        int arr[]={2,6,4,5,7,9};
        int n=arr.length;
        System.out.println((long)product(arr, n));

    }
    
}
