import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char c=sc.next().charAt(0);
        String re=" ";
        char a[]=st.toCharArray();
        for(int i=0;i<st.length();i++){
            if(a[i]!=c){
                re+=a[i];
            }
            
        }
        System.out.println(re);
        
        
    }
}
