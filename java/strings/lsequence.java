//package strings;
import java.util.*;
public class lsequence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
      //  char a[]=str.toCharArray();
      int n=str.length();
      int i=0,j=0,k=0;
      while(i<n-1){
        if (str.charAt(i)!=str.charAt(i+1)){
            k++;
            i++;
            
        }
        else j=k;
       

      }
      System.out.println(k-j+1);
}}
