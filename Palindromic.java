import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        StringBuilder input=new StringBuilder(str);
       input=input.reverse();
       String output=input.toString();
        if(str.equals(output)){
            System.out.println("YES");
        }else
            {
                System.out.println("NO");
            }
    }
}
