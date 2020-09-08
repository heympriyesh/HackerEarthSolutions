import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            String first=sc.next().toLowerCase();
            String second=sc.next().toLowerCase();
            for(int i=0;i<first.length();i++){
                
                char s=first.charAt(i);

                String str=Character.toString(s);
                if(second.contains(str)){

                first=first.replaceFirst(str,"");

                second=second.replaceFirst(str,"");

                i--;

                }
            }
                int sum=first.length()+second.length();
                System.out.println(sum);
            T--;
        }

    }
}
