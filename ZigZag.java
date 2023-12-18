import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        int arr[]={7,7,6,8,15,9,3,1};
        solution(arr);
    }

    private static void solution(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for(int item: arr) {
            set.add(item);
        }
        
        arr=new int[set.size()];
        int p=0;
        for(int item: set) {
            arr[p++] = item;
        }
        
    }
}
