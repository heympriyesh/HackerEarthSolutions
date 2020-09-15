import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int b=7,a=0;
        while(T>0)
        {
            int n=sc.nextInt();
            if(b-n<n-a) {
                System.out.println("B");
                b=n;
            }
            else if(b-n==n-1) {
                System.out.println("A");
                a=n;
            }
            else {
                System.out.println("A");
                a=n;
            }

            T--;
        }

    }
}
