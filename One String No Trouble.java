import java.util.*;

class One String No Trouble{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        long count=0;
        long max=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                max=1;
            }
            else
                max++;
            count=Math.max(count,max);
        } 
        System.out.println(count);    
    }
}
