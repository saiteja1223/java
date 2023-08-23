import java.util.*;
// Java program to demonstrate working of split()
public class gfg {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String st = sc.nextLine();
      String[] fu = st.split(" ");
     // Integer[] arrofIntegers=
      for(int i=fu.length-1;i>=0;i--)
          System.out.println(fu[i]);

        }
    }
  
  
  
