import java.util.HashMap;
import java.util.*;

public class Isomorphic{
    public static boolean AreIsomorphic(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Character>map1 = new HashMap<>();
        HashMap<Character, Boolean>map2 = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(map1.containsKey(c1)==true){
                if(map1.get(c1) != c2){
                    return false;
                }
            }
            else{
              if(map2.containsKey(c2)==true){
                return false;
              }
              else{
                map1.put(c1,c2);
                map2.put(c1,true);
              }
            }   
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Char: ");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(AreIsomorphic(s1,s2));
        sc.close();
    }   
}
