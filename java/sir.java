import java.util.*;
public class sir {
    public static boolean isprime(int n){
        if (n <= 1) {  
            return false ;  
        }  
        for (int i = 2; i <=Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;
    
        }
        public static int fib(int n){
            int n1=0,n2=1,n3=0;
            for(int i=2;i<=n;i++){
                 n3=n1+n2;
                n1=n2;
                n2=n3;


            }
           // System.out.print(n3);
            
           return n3;
        }
        public static void cal(int arr[]){
            

        }

    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for (int i=0;i<n;i++)
        System.out.println(isprime(arr[i]));
        for (int i=0;i<n;i++){
            if(isprime(arr[i])==true)
            System.out.println(arr[i]);}
           // System.out.println(fib(n));
           fib(n);
        
        
        
    
      

    
}}
