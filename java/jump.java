import java.util.*;
public class jump {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int t=0,k=0;
        for (int i=0;i<n;i++)
            ar[i]=sc.nextInt(); 
            int i=0;
            while(i<n)
            {t=0;
                t=ar[i];
                k+=ar[i];
                i=i+t;
                if(k>=n-1)
                System.out.println("true");
               // break;
            }
               
            
        }

}