import java.util.*;
public class arra {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int ar[]={6,3,5,5,1,2};
        int arr[]={3,5,5,4,8};
        int tem[]=new int[ar.length];
        Arrays.sort(ar);
        int j=0;
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
         }
         for(int i=0;i<ar.length-1;i++){
         if (ar[i]!=ar[i+1]){
         tem[j]=ar[i];
         j++;
    }}
         tem[j]=ar[ar.length-1];
         for(int k=0;k<tem.length;k++)
     System.out.println(tem[k]);
    
    
}}
