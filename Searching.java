public class Searching {
    public static int search(int arr[], int n,int k)
    {
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
           
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={2,4,5,67,8};
        int n=arr.length;
        System.out.println(search(arr,n,67));
    }
    
}
