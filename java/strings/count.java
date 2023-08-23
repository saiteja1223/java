//package strings;
import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if (!map.containsKey(a[i])){
                map.put(a[i],1);

            }
            else map.put(a[i],map.get(a[i])+1);
        }
        for(Character key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        
    }}
    
}
