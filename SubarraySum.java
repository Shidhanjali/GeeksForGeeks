import java.util.HashMap;
public class SubarraySum {
    public static void SubarraySumIndex(int arr[],int n,int sum){
        int curSum=0;
        int start=0;
        int end=-1;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0; i<n; i++){
            curSum = curSum + arr[i];

            if(curSum - sum == 0){
                start=0;end=i;
                break;
            }
            if(map.containsKey(curSum - sum)){
                start=map.get(curSum - sum)+1;
                end=i;
                break;
            }
            map.put(curSum,i);
        }
        if(end==-1){
            System.out.println("noy found");
        }
        else{
            System.out.println(start+" "+end);
        }
      
        
    }
    public static void main(String[] args) {
       int arr[]={1,3,4,6,7,9,8};
        int sum =13 ;
        int n = arr.length;
        SubarraySumIndex(arr, n,sum);
      
    } 
}