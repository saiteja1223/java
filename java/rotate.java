import java.util.*;
public class rotate {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int k=sc.nextInt();
        for (int i=0;i<n;i++)
        ar[i]=sc.nextInt(); 
        int tem[]=new int[n]; 
        for(int i=0;i<k;i++){
            tem[i]=ar[n-k];
        }
        
        for(int i=0;i<n-k;i++){
            tem[k]=ar[i];
            k++;
        }
        for (int i=0;i<n;i++){
            System.out.println(tem[i]);
        }
}
}