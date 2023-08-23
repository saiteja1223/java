import java.util.*;
public class hash {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String v=new String(" ");
        String a=new String(" ");
      int n=str.length();
      for(int i=0;i<n;i++){
        if (str.charAt(i)=='#'){
            v=v+str.charAt(i);


        }
        else {
            a=a+str.charAt(i);
        }

      }
      System.out.print(v+a);
    }
    
}
