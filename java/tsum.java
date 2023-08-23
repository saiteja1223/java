import java.util.*;
public class tsum {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int csum=0;
        for (int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        Arrays.sort(ar);
        for(int i=0;i<ar.length-2;i++){
        int l=ar.length-1;
        int j=i+1;
        int val=ar[i];
        while(j<l){
        csum=val+l+j;
        if (csum==0)
        System.out.println(val+" "+ar[l]+" "+ar[j]);
        else if (csum<0){
            j++;
        }
        else l--;
        }}
    
    }
    
}
