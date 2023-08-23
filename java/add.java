import java.util.*;
public class add {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int i=0;
        int arr[]=new int[3];
        while(n>0)
        {
             t=n%10;
            n=n/10;
            //int arr[]=new int[3];
            //for(int i=0;i<3;i++){
            arr[i]=t;
            i++;
           // break;
            }
            for(int j=0;j<3;j++)
            System.out.print(arr[j]);
            
 
        

}}
