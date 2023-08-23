import java.util.*;
public class hsum {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,cur=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();


    
    for(int i=0;i<arr.length;i++){
        cur+=arr[i];
        if (cur>max)
        max=cur;
        if(cur<0)
        cur=0;

    }
    System.out.println(max);
}
}
