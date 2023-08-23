import java.util.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
public class exp {
    public static void main(String[] args) 
    {
        //Creating the HashMap 
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
         
        //Adding key-value pairs to HashMap
         
        map.put(1, "AAA");
         
        map.put(2, "BBB");
         
        map.put(3, "CCC");
         
        map.put(4, "DDD");
         
        map.put(5, "EEE");
         
        //Retrieving the Key Set
         
       // Set<Integer> keySet = map.keySet();
         
        for (Integer   key : map.keySet()) 
        {
            System.out.println(key);
        }
        System.out .println(map.values());
        if (!map.containsKey(5))
        System.out .println("fuck");
    }   
}
    

