import java.util.*;
public class slide {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int win=0,cur=0;
        int arr[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for (int i=0;i<k;i++){
            win+=arr[i];

        }
        for(int i=0;i<arr.length;i++){
            win=win+arr[i+k]-arr[i];
        }
        cur=Math.max(cur,win);
        System.out.println(cur);
        
        
        
}}
