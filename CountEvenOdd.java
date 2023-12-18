public class CountEvenOdd{
    public static void Count(int arr[],int n){
        int countEven=0,countOdd=0;
    
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println(countEven+"  "+countOdd);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Count(arr, 5);

    }
}