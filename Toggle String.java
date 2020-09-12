import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
        char[] ok=str.toCharArray();
       for(int i=0;i<str.length();i++){
           if(Character.isLowerCase(ok[i])){
               ok[i]=Character.toUpperCase(ok[i]);
           }else{
              ok[i]=Character.toLowerCase(ok[i]);
           }
       }
       String output=new String(ok);
       System.out.println(output);

    }
}
