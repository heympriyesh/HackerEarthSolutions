import java.util.*;

class StringSum{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int ok=96;
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int num=(int)ch;
            sum+=num-96;
        }
        System.out.println(sum);

    }
}
