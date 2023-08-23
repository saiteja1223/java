import java.util.*;
public class hash1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        //int max=0,cur=0;
        String arr=sc.nextLine();
        int n=arr.length();
        char a[]=arr.toCharArray(); 
        
        HashMap<Character,Integer>puppy=new HashMap<>();
        for(int i=0;i<n;i++){
            if (!puppy.containsKey(a[i]))
            puppy.put(a[i],1);
            else
            puppy.put(a[i],puppy.get(a[i])+1);
        }
        for(Character s:puppy.keySet())
        if(puppy.get(s)==1){
        System.out.println(s);
        break;}
}}
