import java.lang.*;
public class ReverseString 
{
    public static void ReverseWord(String str)
    {
        String rev_str=" ";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            System.out.print(ch+"");
            rev_str = ch + rev_str;
        }
        System.out.println("\n Reverse String: "+rev_str);

    }

    public static void main(String args[]){
        String str1="Geeksforgeeks";
        ReverseWord(str1);

    }
    
}
