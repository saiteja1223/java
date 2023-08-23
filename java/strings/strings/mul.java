import java.io.*;
import java.util.*;

public class mul   {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t=1;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                t=1;
               for(int j=0;j<n;j++){
                if(j==i){
                    t=t*1;
                    
                }
                else
                t=t*a[j];
               }
               System.out.print(t+" ");
            }
        
        }
        
    }

    

