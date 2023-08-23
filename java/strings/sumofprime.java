import java.util.*;
public class sumofprime {
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2;i<n/2;i++)
            if (n%i==0)
        return false;
        return isprime;
    }
    public static void sum(int n ){
        for(int i=2;i<n/2;i++){
            if (isprime(i)){
                if(isprime(n-i))
                System.out.println(n+" ="+i+ "+" +(n-i));
            }
            
        
        
    }}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       // System.out.println(sum(n));
       sum(n);
       // System.out.println(isprime(n));

    }
}
