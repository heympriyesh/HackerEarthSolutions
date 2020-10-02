import java.util.*;
class RainSound{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int s=sc.nextInt();

            l=(l-1)/s+1;
            r=r/s;
            if(l>r){
                System.out.println("-1 -1");
            }else{
                System.out.println(l+" "+r);
            }
            
        }

    }
}
