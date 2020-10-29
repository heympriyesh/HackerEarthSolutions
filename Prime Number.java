import java.util.*;

class TestClass {
    public static boolean isPrime(int num)
    {
        int rem;
        for(int i=2;i<=num/2;i++)
        {
            rem=num%i;
            if(rem==0)
                return false;
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        boolean flag=true;
        for(int i=2;i<n;i++)
        {
            flag=isPrime(i);
            if(flag)
            {
                str=str+i+" ";
            }
        }
        System.out.println(str);
    }
}
