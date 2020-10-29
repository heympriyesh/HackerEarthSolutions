import java.util.*;
class TestClass {
    public static boolean CheckPrime(int num)
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int first=sc.nextInt();
            int second=sc.nextInt();
            int count=0;
            boolean flag=true;
            while(first<=second)
            {
                if(first==1)
                    first++;
                flag=CheckPrime(first);
                if(flag)
                    count++;
                first++;
            }
            System.out.println(count);
        }
    }
}
