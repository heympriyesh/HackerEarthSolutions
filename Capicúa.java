import java.util.*;

class Capicúa{
    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            String str=sc.next();
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            if(str.equals(sb.toString()))
                {
                    System.out.println("YES");
                }
            else
                System.out.println("NO");
        }

    }
}
