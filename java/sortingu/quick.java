//package sortingu;
import java.util.*;
public class quick {
    static void swap(int i, int j){
        int tem=i;
        i=j;
        j=tem;
    }
    static int partion(int ar[],int low,int high){
       int pivot =ar[low];
       int i=low;
       int j=high;
       while(i<j){
        if(pivot>ar[i]){
            i++;
        }
        if(pivot<ar[j])
          j--;
       }
       swap(i,j);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
}}

