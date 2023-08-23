import java.util.*;
public class kadens {
    public static void main (String args[]){
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int omax=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
       int cmax=arr[0];
    for(int i=1;i<n;i++)
    {
       cmax=cmax+arr[i];
       cmax=Math.max(cmax, arr[i]);
       omax=Math.max(omax,cmax);
       

    }
    System.out.println(omax);
}
}