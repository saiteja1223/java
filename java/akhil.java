import java.util.*;
public class akhil {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<n;i++)
ar[i]=sc.nextInt();
int k=sc.nextInt();
ArrayList<Integer> sai=new ArrayList<>();
for(int i=k;i<=n-1;i++)
sai.add(ar[i]);
for(int i=k-1;i>=0;i--)
sai.add(n-k, ar[i]); 
// System.out.print(sai);
//sai.toArray(ar);
for(int i=0;i<n;i++)
System.out.print(sai);
}}
