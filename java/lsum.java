import java.util.*;
public class lsum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int fmax=arr[0], scur=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(int i=1;i<n;i++){
          if (arr[i] > fmax){
          scur=fmax;
       
        fmax=arr[i];
      }}
      System.out.println(fmax+scur);
    
}}
