//package sortingu;
import java.util.*;

public class merg {
  static void  mer(int ar[],int lb,int mid,int up){
         int i=0;
         int j=mid+1;
         int f=0;
         int temp[]=new int[ar.length];
         while(i<=mid && j<=up){
            if(ar[i]<ar[j]){
                temp[f]=ar[i];
                i++;
            }
            else{
                temp[f]=ar[j];
                j++;

            }
            f++;
         }
         if(i>mid){
            while(j<=up){
            temp[f]=ar[j];
            j++;f++;
         }}
         else{
            while(i<=mid){
                temp[f]=ar[i];
                f++;i++;
            }
         }
         for(int k=0;k<ar.length;k++)
         ar[k]=temp[k];
         
    }
    static void mergsort(int ar[],int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergsort(ar,lb,mid);
            mergsort(ar,mid+1,ub);
            mer(ar,lb,mid,ub);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        mergsort(ar,0,n-1);
        for(int i=0;i<n;i++)
        System.out.println(ar[i]);
    
}}
