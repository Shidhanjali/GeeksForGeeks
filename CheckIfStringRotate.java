import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckIfStringRotate{
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        
        String right, left;
        right = str1;
        left = str1;
        int n = str1.length();
        
        reverse(right.begin(), right.end());
        reverse(right.begin(), right.begin() + 2);
        reverse(right.begin() + 2, right.begin() + n);
        
      
        reverse(left.begin(), left.begin() + 2);
        reverse(left.begin() + 2, left.begin() + n);
        reverse(left.begin(), left.end());
        
        if(right == str2){
            return true;
        }
        else{
            if(left == str2){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
}
