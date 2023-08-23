import java.util.*;
public class raindrops {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        //int csum=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int r[]=new int[n];
        int l[]=new int[n];
        l[0]=ar[0];
        for (int i=1;i<ar.length-1;i++){
          l[i]  =Math.max(l[i-1],ar[i]);
        }
        r[n-1]=ar[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],ar[i]);
        }
     int ans=0;
     for(int i=0;i<n;i++){
        ans+=(Math.min(l[i],r[i])-ar[i]);
        
     }
     System.out.println(ans);
        
}
}