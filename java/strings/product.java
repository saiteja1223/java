import java.util.*;
public class product {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if (ar[i]<k){
                continue;
            }
            else k=ar[i];

        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
        }


    }
    
}
