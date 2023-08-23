import java.util.*;
public class prime {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
     HashMap<Integer,Integer>map=new HashMap<>();
     for (int i=0;i<n;i++){
        if(!map.containsKey(arr[i]))
        //if(map.get(i)==null)
        map.put(arr[i],1);
        else map.put(arr[i],map.get(arr[i])+1);

     }
     
        for(Integer i:map.keySet()){
        if(map.get(i)>1) 
            System.out.print(i+" ");
    }
    
    }
    
}
