
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] array=new int[size];
        double ans=1;
        double b=(Math.pow(10,9)+7);
        for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
        ans=(ans*array[i])%b;
        }
        System.out.println(Math.round(ans));
        
    }
}
