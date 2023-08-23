//package sortingu;
import java.util.*;
public class bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i-1);j++){
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
               
                
                }}}
                for(int i=0;i<n;i++)
                System.out.print(ar[i]+" ");
        

        
    
}}
