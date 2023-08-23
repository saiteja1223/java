import java.util.*;
public class jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         int t=0,k=0;
         for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
             for(int i=0;i<n;i+=t){
                a[i]=t;
                k=t;
             }
             if(k==n-1)
             System.out.println("true");

}}
