import java.util.*;
public class lcs {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char a[]=str.toCharArray();
        int st=0,mx=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(a[i]))
            st=Math.max(map.get(a[i]),st);
            map.put(a[i],i);
            mx=Math.max(mx,i-st);

            
        
        }
            

            System.out.println(mx);
        

    }
    
}
