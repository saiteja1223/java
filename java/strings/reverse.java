import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String str2=new String(" "); 
        StringBuilder str1=new StringBuilder(str);
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=32){
                str1.append(str.charAt(i));
            }
            str2=str2+str1.reverse();
            
        }
        System.out.println(str2);

    }
}
