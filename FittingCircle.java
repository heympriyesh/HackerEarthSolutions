import java.util.*;

class FittingCircle{
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a>b){
                System.out.println(a/b);
            }else{
                System.out.println(b/a);
            }
            t--;
        }
        
    }
}
