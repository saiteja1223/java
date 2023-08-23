import java.util.*;
public class equi  {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         int fsum=0,lsum=0,sum=0;
         for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
             for(int i=0;i<n;i++)
             {
                sum+=a[i];

             }
             lsum=sum;
            for(int i=0;i<n;i++)
            {
                lsum-=a[i];
                if(lsum==fsum)
                System.out.println(i);

            
            fsum+=a[i];
             }
             System.out.println(-1);
            }
}
